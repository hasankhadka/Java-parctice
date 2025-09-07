document.getElementById("loginForm").addEventListener("submit", function (e) {
  e.preventDefault(); // Prevent form submission

  const username = document.getElementById("username").value.trim();
  const password = document.getElementById("password").value.trim();
  const errorMessage = document.getElementById("error-message");

  if (username === "" || password === "") {
    errorMessage.textContent = "Please fill in all fields.";
  } else {
    // Simulate successful login
    errorMessage.style.color = "green";
    errorMessage.textContent = "Login successful!";
    
    // You could redirect or handle login here
    // window.location.href = "/dashboard.html";
  }
});
AnimationEffect;

