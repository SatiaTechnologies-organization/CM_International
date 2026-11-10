document.addEventListener("DOMContentLoaded", () => {
    // --- MOBILE MENU TOGGLE ---
    const menuBtn = document.getElementById("mobileMenuBtn");
    const mobileMenu = document.getElementById("mobileMenu");

    if (menuBtn && mobileMenu) {
        menuBtn.addEventListener("click", () => {
            mobileMenu.classList.toggle("hidden");
        });
    }

    // Auto-close mobile menu when a navigation link inside it is clicked
    if (mobileMenu) {
        mobileMenu.querySelectorAll("a").forEach(link => {
            link.addEventListener("click", () => {
                mobileMenu.classList.add("hidden");
            });
        });
    }

    // --- LANGUAGE SWITCHER LOGIC ---
    const langButtons = document.querySelectorAll(".lang-btn");
    const translatableElements = document.querySelectorAll("[data-en][data-de]");
    const placeholderElements = document.querySelectorAll("[data-en-placeholder][data-de-placeholder]");

    function setLanguage(lang) {
        // 1. Translate all text nodes
        translatableElements.forEach(element => {
            const text = element.getAttribute(`data-${lang}`);
            if (text !== null && text !== "") {
                element.innerHTML = text.replace(/\n/g, '<br>');
            }
        });

        // 2. Translate placeholders
        placeholderElements.forEach(element => {
            const text = element.getAttribute(`data-${lang}-placeholder`);
            if (text !== null && text !== "") {
                element.setAttribute("placeholder", text);
            }
        });

        // 3. Update active button style
        langButtons.forEach(btn => {
            if (btn.getAttribute("data-lang") === lang) {
                btn.classList.add("active");
            } else {
                btn.classList.remove("active");
            }
        });

        // 4. Save preference
        localStorage.setItem("cmi_lang", lang);
        document.documentElement.lang = lang;
    }

    langButtons.forEach(btn => {
        btn.addEventListener("click", (e) => {
            e.preventDefault();
            const targetLang = btn.getAttribute("data-lang");
            setLanguage(targetLang);
        });
    });

    // Default to German
    const savedLang = localStorage.getItem("cmi_lang") || "de";
    setLanguage(savedLang);
});