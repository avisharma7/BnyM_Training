document
  .getElementById("registrationForm")
  .addEventListener("submit", function (event) {
    event.preventDefault();
    const form = event.target;
    const email = form.email.value;
    const phone = form.phone.value;

    let valid = true;

    // Validate email
    if (!validateEmail(email)) {
      showError(form.email, "Please enter a valid email address.");
      valid = false;
    } else {
      removeError(form.email);
    }

    // Validate phone number
    if (!validatePhoneNumber(phone)) {
      showError(form.phone, "Please enter a valid phone number.");
      valid = false;
    } else {
      removeError(form.phone);
    }

    // Check if form is valid
    if (valid) {
      alert("Employee registered successfully!");
      form.reset();
    }
  });

function validateEmail(email) {
  const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
  return emailPattern.test(email);
}

function validatePhoneNumber(phone) {
  const phonePattern = /^[0-9]{10}$/;
  return phonePattern.test(phone);
}

function showError(input, message) {
  input.classList.add("error");
  let errorElement = input.nextElementSibling;
  if (!errorElement || !errorElement.classList.contains("error-message")) {
    errorElement = document.createElement("div");
    errorElement.classList.add("error-message");
    input.parentNode.insertBefore(errorElement, input.nextSibling);
  }
  errorElement.textContent = message;
}

function removeError(input) {
  input.classList.remove("error");
  let errorElement = input.nextElementSibling;
  if (errorElement && errorElement.classList.contains("error-message")) {
    errorElement.remove();
  }
}

function showAlert() {
  const dateOfJoining = document.getElementById("dateOfJoining").value;
  const today = new Date().toISOString().split("T")[0];

  if (dateOfJoining > today) {
    alert("Date of Joining cannot be in the future.");
    return false; // Prevent form submission
  }

  alert("Congratulations! Your registration is successful");
  return true; // Allow form submission
}
