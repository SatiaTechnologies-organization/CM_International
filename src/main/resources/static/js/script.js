// Define translations
const translations = {
    de: {
        nav_home: "Startseite",
        nav_about: "Über uns",
        nav_edu: "Bildung",
        nav_hosp: "CMI Krankenhaus",
        nav_sponsor: "Kind sponsern",
        nav_donate: "Spenden",
        nav_contact: "Kontakt",
        hero_title: "Kindern Bildung ermöglichen. Gemeinschaften heilen. Christus teilen.",
        hero_desc: "Eine deutsch finanzierte Mission in Kenia, die weniger privilegierten Kindern vom Grundschul- bis zum Universitätsabschluss hilft und die Gemeinde durch das neu gebaute CMI-Krankenhaus unterstützt.",
        btn_sponsor: "Kind sponsern",
        btn_donate: "Für die Mission spenden",
        pillars_title: "Unsere drei Säulen",
        p1_title: "Bildung auf höchstem Niveau",
        p1_desc: "Bereitstellung von Bildungsstipendien von der Grundschule bis zur Universität, Schulmaterial, Mentoring und Lernunterstützung für benachteiligte Kinder.",
        p1_stat_num: "120+",
        p1_stat_lbl: "Kinder gesponsert",
        p2_title: "CMI Krankenhaus",
        p2_desc: "Bereitstellung einer mitfühlenden Gesundheitsversorgung für die lokale Gemeinde durch unsere neu gebaute Klinik und das Krankenhaus, mit medizinischer Versorgung, Mutterschaftsgesundheit und Outreach.",
        p2_stat_num: "15",
        p2_stat_lbl: "Studenten an der Universität",
        p3_title: "Glaube in Aktion",
        p3_desc: "Teilen der Liebe Christi durch Gemeinde-Outreach, Jüngerschaftsprogramme und Dienst mit Würde, Hoffnung und Mitgefühl.",
        p3_stat_num: "1",
        p3_stat_lbl: "Krankenhaus gebaut",
        story_label: "ERFOLGSGESCHICHTE",
        story_title: "Treffen Sie Aisha — Vom gesponserten Schüler zur Universitätsstudentin",
        story_quote: '"Dank der Unterstützung von CMI kann ich jetzt Umweltwissenschaften an der Universität studieren. Die Unterstützung gab mir Hoffnung, Schulgebühren und Mentoring. Ich träume davon, eines Tages meiner Gemeinde etwas zurückzugeben."',
        story_author: "— Aisha, 20, jetzt im 2. Jahr an der Universität von Nairobi",
        story_link: "Lesen Sie mehr Schülererfolge →",
        footer_about: "Deutsch finanzierte Mission in Kenia, die Bildung, Gesundheitsversorgung und Hoffnung durch Christus bringt.",
        footer_k_contact: "Kontakt — Kenia",
        footer_k_addr: "CMI Centre, Kitale, Kenia",
        footer_g_contact: "Kontakt — Deutschland",
        footer_g_addr: "CMI Deutschland e.V., Berlin, Deutschland",
        footer_copy: "© 2024 Christian Mission International · cmi-onlee.info · Eingetragene NGO in Kenia & Deutschland · Datenschutz · Impressum"
    },
    en: {
        nav_home: "Home",
        nav_about: "About Us",
        nav_edu: "Education",
        nav_hosp: "CMI Hospital",
        nav_sponsor: "Sponsor a Child",
        nav_donate: "Donate",
        nav_contact: "Contact",
        hero_title: "Educating Children. Healing Communities. Sharing Christ.",
        hero_desc: "German-funded mission in Kenya sponsoring less fortunate children from primary school to university, and serving the community through the newly built CMI Hospital.",
        btn_sponsor: "Sponsor a Child",
        btn_donate: "Donate to the Mission",
        pillars_title: "Our Three Pillars",
        p1_title: "Education to the Highest Level",
        p1_desc: "Providing quality primary to university education sponsorship, school supplies, mentorship, and learning support for vulnerable children.",
        p1_stat_num: "120+",
        p1_stat_lbl: "Children Sponsored",
        p2_title: "CMI Hospital",
        p2_desc: "Delivering compassionate healthcare to the local community through our newly built clinic and hospital, offering medical care, maternal health, and outreach.",
        p2_stat_num: "15",
        p2_stat_lbl: "Students in University",
        p3_title: "Faith in Action",
        p3_desc: "Sharing Christ's love through community outreach, discipleship programs, and serving with dignity, hope, and compassion.",
        p3_stat_num: "1",
        p3_stat_lbl: "Hospital Built",
        story_label: "SUCCESS STORY",
        story_title: "Meet Aisha — From Sponsored Pupil to University Student",
        story_quote: '"Because of CMI\'s sponsorship, I can now study Environmental Science at university. The support gave me hope, school fees, and mentorship. I dream of giving back to my community one day."',
        story_author: "— Aisha, 20, now in Year 2 at University of Nairobi",
        story_link: "Read more student stories →",
        footer_about: "German-funded mission in Kenya, bringing education, healthcare, and hope through Christ.",
        footer_k_contact: "Contact — Kenya",
        footer_k_addr: "CMI Centre, Kitale, Kenya",
        footer_g_contact: "Contact — Germany",
        footer_g_addr: "CMI Deutschland e.V., Berlin, Germany",
        footer_copy: "© 2024 Christian Mission International · cmi-onlee.info · Registered NGO in Kenya & Germany · Privacy · Imprint"
    }
};

// Function to change the language
function setLanguage(lang) {
    // 1. Update HTML lang attribute
    document.documentElement.lang = lang;

    // 2. Loop through all elements with a data-key attribute
    const elements = document.querySelectorAll('[data-key]');
    elements.forEach(element => {
        const key = element.getAttribute('data-key');
        if (translations[lang] && translations[lang][key]) {
            // If it's an input, change value, otherwise change innerHTML
            if (element.tagName === 'INPUT') {
                element.value = translations[lang][key];
            } else {
                element.innerHTML = translations[lang][key];
            }
        }
    });

    // 3. Update button styles
    document.getElementById('btn-en').classList.remove('active');
    document.getElementById('btn-de').classList.remove('active');
    document.getElementById(`btn-${lang}`).classList.add('active');
}

// Initialize language on page load (Default to German as requested)
document.addEventListener('DOMContentLoaded', () => {
    setLanguage('de');
});