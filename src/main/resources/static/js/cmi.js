document.addEventListener("DOMContentLoaded", () => {
    const menuToggle = document.getElementById("menuToggle");
    const mainNav = document.getElementById("mainNav");

    menuToggle?.addEventListener("click", () => {
        const isOpen = mainNav.classList.toggle("open");
        menuToggle.setAttribute("aria-expanded", String(isOpen));
        menuToggle.textContent = isOpen ? "×" : "☰";
    });

    mainNav?.querySelectorAll("a").forEach(link => {
        link.addEventListener("click", () => {
            mainNav.classList.remove("open");
            menuToggle?.setAttribute("aria-expanded", "false");
            if (menuToggle) menuToggle.textContent = "☰";
        });
    });

    document.querySelectorAll(".lang").forEach(button => {
        button.addEventListener("click", () => {
            const language = button.dataset.lang;
            document.documentElement.lang = language;
            document.querySelectorAll(".lang").forEach(item =>
                item.classList.toggle("active", item === button)
            );
            document.querySelectorAll("[data-en][data-de]").forEach(element => {
                element.textContent = element.dataset[language];
            });
        });
    });
});
