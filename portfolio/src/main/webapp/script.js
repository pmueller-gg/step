// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random greeting to the page.
 */
function addRandomGreeting() {
  const greetings =
      ['Hello world!', '¡Hola Mundo!', '你好，世界！', 'Bonjour le monde!'];

  // Pick a random greeting.
  const greeting = greetings[Math.floor(Math.random() * greetings.length)];

  // Add it to the page.
  const greetingContainer = document.getElementById('greeting-container');
  greetingContainer.innerText = greeting;
}

function navbar_set_active_item(){
  var current_webpage = location.pathname.substring(1); //Don't count the leading /
  if (current_webpage.length < 1) //Don't need to set an active item if on index
    return ;
  if (current_webpage[0] == 'a')
    document.getElementById("about").classList.add("active");
  else if(current_webpage[0] == 'r')
    document.getElementById("resume").classList.add("active");
  else if (current_webpage[0] == 's')
    document.getElementById("social").classList.add("active");
  else if (current_webpage[0] == 't')
    document.getElementById("series").classList.add("active");
}

function redirectFunction(){
  window.location.pathname='/resources/resume.pdf';
}