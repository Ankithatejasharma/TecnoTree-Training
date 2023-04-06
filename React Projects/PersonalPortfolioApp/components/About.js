import React from 'react';

function About() {
  return (
    <div className="about">
      
      <h2 class="h">About Me</h2>
      <center><p class="p">I am Ankitha Teja Sharma.<br></br> I am from Ramanagaram, Karnataka.<br/> I completed my schooling from SMPS Ramanagar, and now I am currently pursuing mu B.E from MITT<br/> </p></center>
      <img src={require('../images/img.jpeg')}  class="img" height='500px' width='500px'/>
      

    </div>
  );
}

export default About;
