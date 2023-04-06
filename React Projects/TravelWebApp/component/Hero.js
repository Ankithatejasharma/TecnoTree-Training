import React from 'react';
import { Link } from 'react-router-dom';
import styles from '../Hero.module.css';
import beachImage from '../images/beach.gif';

function Hero() {
  return (
    <section className={styles.hero} style={{ backgroundImage: `url(${beachImage})` }}>
      <div className={styles.heroContent}>
        <h1 className={styles.heroTitle}>Discover Your Next Adventure</h1>
        <p className={styles.heroDescription}>Find the perfect package for your next vacation.</p>
        <Link to="/packages" className={styles.heroButton}>Explore Packages</Link>
      </div>
    </section>
  );
}

export default Hero;
