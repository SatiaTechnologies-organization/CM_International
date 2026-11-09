document.addEventListener("DOMContentLoaded", () => {
    // Debugging: This will print in the F12 console to prove the script loaded
    console.log("1. CMI JS Loaded successfully.");

    // --- MOBILE MENU TOGGLE ---
    const menuBtn = document.getElementById("mobileMenuBtn");
    const mobileMenu = document.getElementById("mobileMenu");

    if (menuBtn && mobileMenu) {
        menuBtn.addEventListener("click", () => {
            mobileMenu.classList.toggle("hidden");
        });
    }

    // --- LANGUAGE SWITCHER LOGIC ---
    const langButtons = document.querySelectorAll(".lang-btn");
    const translatableElements = document.querySelectorAll("[data-en][data-de]");

    console.log("2. Found language buttons:", langButtons.length);
    console.log("3. Found translatable text elements:", translatableElements.length);

    function setLanguage(lang) {
        console.log("4. Switching language to:", lang);

        // 1. Translate all text
        translatableElements.forEach(element => {
            const text = element.getAttribute(`data-${lang}`);
            if (text) {
                element.textContent = text;
            }
        });

        // 2. Update active button style
        langButtons.forEach(btn => {
            if (btn.getAttribute("data-lang") === lang) {
                btn.classList.add("active");
            } else {
                btn.classList.remove("active");
            }
        });

        // 3. Save preference
        localStorage.setItem("cmi_lang", lang);
        document.documentElement.lang = lang;
    }

    // Add click events
    langButtons.forEach(btn => {
        btn.addEventListener("click", (e) => {
            e.preventDefault(); // Prevent any weird form submissions
            const targetLang = btn.getAttribute("data-lang");
            setLanguage(targetLang);
        });
    });

    // Initialize language on load (Default to German)
    const savedLang = localStorage.getItem("cmi_lang") || "de";
    setLanguage(savedLang);
});
document.addEventListener("DOMContentLoaded", () => {
    // --- MOBILE MENU TOGGLE ---
    const menuToggle = document.getElementById("menuToggle");
    const mainNav = document.getElementById("mainNav");

    if (menuToggle && mainNav) {
        menuToggle.addEventListener("click", () => {
            const isOpen = mainNav.classList.toggle("open");
            menuToggle.setAttribute("aria-expanded", String(isOpen));
            menuToggle.textContent = isOpen ? "×" : "☰";
        });

        // Close menu when a link is clicked
        mainNav.querySelectorAll("a").forEach(link => {
            link.addEventListener("click", () => {
                mainNav.classList.remove("open");
                menuToggle.setAttribute("aria-expanded", "false");
                menuToggle.textContent = "☰";
            });
        });
    }

    // --- LANGUAGE SWITCHER ---
    const langButtons = document.querySelectorAll(".lang");
    const translatableElements = document.querySelectorAll("[data-en][data-de]");

    function setLanguage(lang) {
        // 1. Change text content
        translatableElements.forEach(element => {
            const text = element.getAttribute(`data-${lang}`);
            if (text) {
                element.innerHTML = text; // Using innerHTML to preserve line breaks if any
            }
        });
        langButtons.forEach(btn => {
            if (btn.getAttribute("data-lang") === lang) {
                btn.classList.add("active");
            } else {
                btn.classList.remove("active");
            }
        });
        document.documentElement.lang = lang;
    }
    langButtons.forEach(btn => {
        btn.addEventListener("click", () => {
            const targetLang = btn.getAttribute("data-lang");
            setLanguage(targetLang);
        });
    });
    setLanguage("de");
});