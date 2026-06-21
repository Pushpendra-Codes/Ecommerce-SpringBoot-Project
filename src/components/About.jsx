
const About = () => {
  return (
    <div
      style={{
        minHeight: "100vh",
        display: "flex",
        justifyContent: "center",
        alignItems: "center",
      }}
    >
      <div
        style={{
          padding: "40px",
          borderRadius: "15px",
          background: "#1e1e1e",
          color: "white",
          textAlign: "center",
          boxShadow: "0 8px 20px rgba(0,0,0,0.3)",
        }}
      >
        <h1>About Developer</h1>
        <h3>Pushpendra Patidar</h3>

        <a
          href="https://www.instagram.com/pushpendra_patidar16/"
          target="_blank"
          rel="noreferrer"
          style={{
            textDecoration: "none",
            fontSize: "18px",
          }}
        >
          Instagram: @pushpendra_patidar16
        </a>
      </div>
    </div>
  );
};

export default About;

export default About;
