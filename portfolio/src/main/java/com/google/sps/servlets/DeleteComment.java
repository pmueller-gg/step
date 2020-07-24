package com.google.sps.servlets;

import com.google.sps.classes.Comment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/delete-comment")
public class DeleteComment extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    Query q = new Query("Comment").addSort("timestamp");
    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();

    PreparedQuery results = datastore.prepare(q);

    for (Entity it : results.asIterable()) {
       datastore.delete(it.getKey());
    }
  }
}
