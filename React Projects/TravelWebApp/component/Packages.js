import React from 'react';
import { Link } from 'react-router-dom';
import styles from '../Packages.module.css';
import cityImage from '../images/city.jpg';
import mountainImage from '../images/mountain.jpg';
import natureImage from '../images/nature.jpg';

function Packages() {
  return (
    <section className={styles.packages}>
      <div className={styles.packageList}>
        <div className={styles.packageItem}>
          <img src={cityImage} alt="City package" />
          <h2 className={styles.packageTitle}>City Breaks</h2>
          <p className={styles.packageDescription}>Experience the buzz of the city with our handpicked packages.</p>
          <Link to="/packages/city" className={styles.packageButton}>View Packages</Link>
        </div>
        <div className={styles.packageItem}>
          <img src={mountainImage} alt="Mountain package" />
          <h2 className={styles.packageTitle}>Mountain Adventures</h2>
          <p className={styles.packageDescription}>Explore the great outdoors with our mountain adventure packages.</p>
          <Link to="/packages/mountain" className={styles.packageButton}>View Packages</Link>
</div>
<div className={styles.packageItem}>
<img src={natureImage} alt="Nature package" />
<h2 className={styles.packageTitle}>Nature Escapes</h2>
<p className={styles.packageDescription}>Relax and unwind with our nature escape packages.</p>
<Link to="/packages/nature" className={styles.packageButton}>View Packages</Link>
</div>
</div>
</section>
);
}

export default Packages;
