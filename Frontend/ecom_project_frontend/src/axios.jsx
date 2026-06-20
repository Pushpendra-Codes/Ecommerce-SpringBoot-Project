import axios from "axios";

const API = axios.create({
  // baseURL: "http://localhost:8080/api",
  baseURL: "https://ecommerce-springboot-project-11.onrender.com/api",
});
delete API.defaults.headers.common["Authorization"];
export default API;
