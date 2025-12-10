/*!
 * Start Bootstrap - Blog Post v5.0.8 (https://startbootstrap.com/template/blog-post)
 * Copyright 2013-2022 Start Bootstrap
 * Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-blog-post/blob/master/LICENSE)
 */

// Keep the content pushed below the navbar without hard-coded spacing.
(() => {
    const root = document.documentElement;
    const body = document.body;
    const navSelector = "body.page > header .navbar";

    const updateHeaderHeight = () => {
        const nav = document.querySelector(navSelector);
        if (!nav) return;

        const { height } = nav.getBoundingClientRect();
        if (height > 0) {
            const measured = `${Math.ceil(height)}px`;
            root.style.setProperty("--header-height", measured);
            body.style.setProperty("--header-height", measured);
        }
    };

    const init = () => {
        updateHeaderHeight();
        const nav = document.querySelector(navSelector);

        if (nav && typeof ResizeObserver !== "undefined") {
            const resizeObserver = new ResizeObserver(updateHeaderHeight);
            resizeObserver.observe(nav);
        }

        window.addEventListener("resize", updateHeaderHeight, { passive: true });
    };

    if (document.readyState === "loading") {
        document.addEventListener("DOMContentLoaded", init);
    } else {
        init();
    }
})();
