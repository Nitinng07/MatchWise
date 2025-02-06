document.addEventListener("DOMContentLoaded", function () {
    const searchForm = document.querySelector("form");
    
    searchForm.addEventListener("submit", function (event) {
        event.preventDefault();
        alert("Search functionality coming soon!");
    });

    document.querySelector(".btn-warning").addEventListener("click", function () {
        alert("Register now to find your match!");
    });
});
