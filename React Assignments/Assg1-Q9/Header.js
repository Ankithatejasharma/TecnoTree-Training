import React from "react";

const Header = ({ title = "Default Title", subtitle = "Default Subtitle" }) => {
  return (
    <div>
      <h1>{title}</h1>
      <h2>{subtitle}</h2>
    </div>
  );
};

export default Header;
