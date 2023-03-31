import React from 'react';
import Image1 from './download1.jpg';
import Image2 from './download2.jpg';
import Image3 from './download3.jpg';
import Image4 from './download4.jpg';
import Image5 from './download5.jpg';
import Image6 from './download6.jpg';
function App() {
  return (
    <div>
      <h1>PIXAR</h1>
      <div class='grow' id="imgwrap">
      <img src={Image1} alt="Image not found"/>
      <a href='https://pixabay.com/images/search/drop/'><p class='imagedesc'>A droplet</p></a>
      </div>
      <div class='grow1' id="imgwrap1">
      <img src={Image2} alt="Image not found"/>
      <a href='https://pixabay.com/images/search/purpletrees/'><p class='imagedesc1'>The Best Things in Life are Purple</p></a>
      </div>
      <div class='grow2' id='imgwrap2'>
      <img src={Image3} alt="Image not found"/>
      <a href='https://pixabay.com/images/search/squirrel/'><p class='imagedesc2'>Yes!!, You may admire my fluffy tail</p></a>
      </div>
      <div class='grow3' id='imgwrap3'>
      <img src={Image4} alt="Image not found"/>
      <a href='https://pixabay.com/images/search/squirrelwithcamera/'><p class='imagedesc3'>I'll Capture You!!</p></a>
      </div>
      <div class='grow4' id='ingwrap4'>
      <img src={Image5} alt="Image not found"/>
      <a href='https://pixabay.com/images/search/beautifuloceanwaves/'><p class='imagedesc4'>Ocean's Roar</p></a>
      </div>
      <div class='grow5' id='imagewrap5'>
      <img src={Image6} alt="Image not found"/>
      <a href='https://pixabay.com/images/search/nebula/'><p class='imagedesc5'>Pillars of the Universe!!</p></a>
      </div>
     
    </div>
  );
}

export default App;
