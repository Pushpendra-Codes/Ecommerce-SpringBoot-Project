import "./About.css";

const About = () => {
  return (
    <section className="about-page">
      <div className="about-left">
        <p className="hello">Hello 👋</p>

        <h2>
          I'm <span>Pushpendra Patidar</span>
        </h2>

        <h1>Software Developer</h1>

        <p className="desc">
          Passionate Full Stack Developer who enjoys building scalable web
          applications using React, Spring Boot, and PostgreSQL.
        </p>

        <div className="buttons">
          <a
            href="https://www.instagram.com/pushpendra_patidar16/"
            target="_blank"
            rel="noreferrer"
            className="btn-primary"
          >
            Instagram
          </a>

          <a
            href="https://github.com/pushpendra-codes"
            target="_blank"
            rel="noreferrer"
            className="btn-secondary"
          >
            GitHub
          </a>
        </div>
      </div>

      <div className="about-right">
        <div className="circle">
          <div className="name-card">
            <h2>Pushpendra</h2>
            <p>Full Stack Developer</p>
          </div>
        </div>
      </div>
    </section>
  );
};

export default About;
