<%-- 
    Document   : NotExist.jsp
    Created on : Dec 12, 2022, 7:57:46 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="font-size: 16px;" lang="en"><head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="utf-8">
        <meta name="keywords" content="OOPS!">
        <meta name="description" content="">
        <title>NotExist</title>
        <link rel="stylesheet" href="nicepage.css" media="screen">
        <link rel="stylesheet" href="NotExist.css" media="screen">
        <script class="u-script" type="text/javascript" src="jquery.js" defer=""></script>
        <script class="u-script" type="text/javascript" src="nicepage.js" defer=""></script>
        <meta name="generator" content="Nicepage 5.1.5, nicepage.com">
        <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Oswald:200,300,400,500,600,700|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">


        <script type="application/ld+json">{
            "@context": "http://schema.org",
            "@type": "Organization",
            "name": "WebSite3496455",
            "logo": "images/logo.png"
            }</script>
        <meta name="theme-color" content="#478ac9">
        <meta property="og:title" content="NotExist">
        <meta property="og:type" content="website">
    </head>
    <body class="u-body u-xl-mode" data-lang="en"><header class="u-clearfix u-header u-white u-header" id="sec-9f90"><div class="u-clearfix u-sheet u-sheet-1">
                <a href="Front-Page.html" class="u-image u-logo u-image-1" data-image-width="300" data-image-height="300" title="Front Page">
                    <img src="images/logo.png" class="u-logo-image u-logo-image-1">
                </a>
                <form action="search" method="get" class="u-border-1 u-border-grey-30 u-search u-search-left u-white u-search-1">
                    <button class="u-search-button" type="submit">
                        <span class="u-search-icon u-spacing-10">
                            <svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 56.966 56.966"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-51e1"></use></svg>
                            <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" id="svg-51e1" x="0px" y="0px" viewBox="0 0 56.966 56.966" style="enable-background:new 0 0 56.966 56.966;" xml:space="preserve" class="u-svg-content"><path d="M55.146,51.887L41.588,37.786c3.486-4.144,5.396-9.358,5.396-14.786c0-12.682-10.318-23-23-23s-23,10.318-23,23  s10.318,23,23,23c4.761,0,9.298-1.436,13.177-4.162l13.661,14.208c0.571,0.593,1.339,0.92,2.162,0.92  c0.779,0,1.518-0.297,2.079-0.837C56.255,54.982,56.293,53.08,55.146,51.887z M23.984,6c9.374,0,17,7.626,17,17s-7.626,17-17,17  s-17-7.626-17-17S14.61,6,23.984,6z"></path></svg>
                        </span>
                    </button>
                    <input class="u-search-input" type="search" name="search" value="" placeholder="Search">
                    <select class="language" id="language" name="language">
                        <option value="english">English</option>
                        <option value="japanese">Japanese</option>
                        <option value="vietnamese">Vietnamese</option>
                    </select>
                </form>
                <nav class="u-menu u-menu-hamburger u-offcanvas u-menu-1" data-responsive-from="XL">
                    <div class="menu-collapse">
                        <a class="u-button-style u-nav-link" href="#">
                            <svg class="u-svg-link" viewBox="0 0 24 24"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-2b0b"></use></svg>
                            <svg class="u-svg-content" version="1.1" id="svg-2b0b" viewBox="0 0 16 16" x="0px" y="0px" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns="http://www.w3.org/2000/svg"><g><rect y="1" width="16" height="2"></rect><rect y="7" width="16" height="2"></rect><rect y="13" width="16" height="2"></rect>
                            </g></svg>
                        </a>
                    </div>
                    <div class="u-custom-menu u-nav-container">
                        <ul class="u-nav u-unstyled"><li class="u-nav-item"><a class="u-button-style u-nav-link" href="Front-Page.html" style="padding: 10px 34px;">Front Page</a>
                            </li></ul>
                    </div>
                    <div class="u-custom-menu u-nav-container-collapse">
                        <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
                            <div class="u-inner-container-layout u-sidenav-overflow">
                                <div class="u-menu-close"></div>
                                <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2"><li class="u-nav-item"><a class="u-button-style u-nav-link" href="Front-Page.html">Front Page</a>
                                    </li>></ul>
                            </div>
                        </div>
                        <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
                    </div>
                </nav>
            </div></header>
        
        <section class="u-align-left u-clearfix u-image u-shading u-section-1" src="" id="sec-b461" data-image-width="1920" data-image-height="729">
            <div class="u-clearfix u-sheet u-sheet-1">
                <h1 class="u-text u-text-default u-text-white u-title u-text-1">OOPS!</h1>
                <p class="u-large-text u-text u-text-variant u-text-white u-text-2">The word ${searchStr} you searched for might not exist or have not been added to our archive.<br>Help us expand our archive by clicking the add button to add and define a new vocabulary.
                </p>
                <a href="add?word=${searchStr}" class="u-border-2 u-border-grey-75 u-btn u-btn-round u-button-style u-hover-palette-1-light-1 u-palette-1-base u-radius-50 u-btn-1">add new word&nbsp;<span class="u-file-icon u-icon u-text-white u-icon-1"><img src="images/3416075-3349e360.png" alt=""></span>
                </a>
            </div>
        </section>


        <footer class="u-align-center u-clearfix u-footer u-grey-80 u-footer" id="sec-b7b1"><div class="u-clearfix u-sheet u-sheet-1">
                <p class="u-small-text u-text u-text-variant u-text-1">PRJ301 Project Assignment<br>Dang Duc Minh - HE163055
                </p>
            </div></footer>
        <section class="u-backlink u-clearfix u-grey-80">
            <a class="u-link" href="https://nicepage.com/website-templates" target="_blank">
                <span>Website Templates</span>
            </a>
            <p class="u-text">
                <span>created with</span>
            </p>
            <a class="u-link" href="" target="_blank">
                <span>Website Builder Software</span>
            </a>. 
        </section>

    </body></html>
