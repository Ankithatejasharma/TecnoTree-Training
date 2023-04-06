import React from 'react';
import Home from './Home';
import Donate from './Donate';
import Volunteer from './Volunteer';

function Content() {
  const path = window.location.pathname;
  if (path === '/') {
    return <Home />;
  } else if (path === '/donate') {
    return <Donate />;
  } else if (path === '/volunteer') {
    return <Volunteer />;
  } else {
    return <h2>Page Not Found</h2>;
  }
}

export default Content;
