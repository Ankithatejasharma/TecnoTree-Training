import React from 'react';

function Projects() {
  return (
    <div className="projects">
      <h2>My Projects</h2>
      <ul>
        <li>
          <a href="https://github.com/Ankithatejasharma/HRMS-DBMS-mini-project">Human Resource Management System</a><br/>
          <img src={require("../hrms.jpg")} height='250px' width='400px'/>
        </li>
        <li>
          <a href="https://github.com/Ankithatejasharma/My-Website">Mobile Application Development</a><br/>
          <img src={require("../img.png")} height='250px' width='400px'/>
        </li>
        <li>
          <a href="https://github.com/Ankithatejasharma/HRMS-DBMS-mini-project">IPL Team Management(File Structures)</a><br/>
          <img src={require("../ipl.jpeg")} height='250px' width='400px'/>
        </li>
      </ul>
    </div>
  );
}

export default Projects;
