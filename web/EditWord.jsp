<%-- 
    Document   : EditWord
    Created on : Dec 14, 2022, 7:07:16 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="font-size: 16px;" lang="en"><head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="utf-8">
        <meta name="keywords" content="">
        <meta name="description" content="">
        <title>Edit Word</title>
        <link rel="stylesheet" href="nicepage.css" media="screen">
        <link rel="stylesheet" href="Update-Word.css" media="screen">
        <script class="u-script" type="text/javascript" src="jquery.js" defer=""></script>
        <script class="u-script" type="text/javascript" src="nicepage.js" defer=""></script>
        <meta name="generator" content="Nicepage 5.1.5, nicepage.com">
        <meta name="referrer" content="origin">
        <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Oswald:200,300,400,500,600,700|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">


        <script type="application/ld+json">{
            "@context": "http://schema.org",
            "@type": "Organization",
            "name": "WebSite3496455",
            "logo": "images/logo.png"
            }</script>
        <meta name="theme-color" content="#478ac9">
        <meta property="og:title" content="Update Word">
        <meta property="og:type" content="website">
    </head>
    <body class="u-body u-xl-mode" data-lang="en"><header class="u-clearfix u-header u-white u-header" id="sec-9f90"><div class="u-clearfix u-sheet u-sheet-1">
                <a href="Front-Page.html" class="u-image u-logo u-image-1" data-image-width="300" data-image-height="300" title="Front Page">
                    <img src="images/logo.png" class="u-logo-image u-logo-image-1">
                </a>
                <form action="#" method="get" class="u-border-1 u-border-grey-30 u-search u-search-left u-white u-search-1">
                    <button class="u-search-button" type="submit">
                        <span class="u-search-icon u-spacing-10">
                            <svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 56.966 56.966"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-51e1"></use></svg>
                            <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" id="svg-51e1" x="0px" y="0px" viewBox="0 0 56.966 56.966" style="enable-background:new 0 0 56.966 56.966;" xml:space="preserve" class="u-svg-content"><path d="M55.146,51.887L41.588,37.786c3.486-4.144,5.396-9.358,5.396-14.786c0-12.682-10.318-23-23-23s-23,10.318-23,23  s10.318,23,23,23c4.761,0,9.298-1.436,13.177-4.162l13.661,14.208c0.571,0.593,1.339,0.92,2.162,0.92  c0.779,0,1.518-0.297,2.079-0.837C56.255,54.982,56.293,53.08,55.146,51.887z M23.984,6c9.374,0,17,7.626,17,17s-7.626,17-17,17  s-17-7.626-17-17S14.61,6,23.984,6z"></path></svg>
                        </span>
                    </button>
                    <input class="u-search-input" type="search" name="search" value="" placeholder="Search">
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
                                    </li><li class="u-nav-item"></ul>
                            </div>
                        </div>
                        <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
                    </div>
                </nav>
            </div></header>
        <section class="u-clearfix u-gradient u-section-1" id="sec-aada">
            <div class="u-clearfix u-sheet u-sheet-1">
                <h3 class="u-text u-text-default u-text-1">Edit ${def.getWord()}'s definition</h3>
                <div class="u-form u-form-1">
                    <form action="edit" method="post" class="u-clearfix u-form-spacing-10 u-form-vertical u-inner-form" source="email" name="form" style="padding: 10px;" redirect="true">
                        <div class="u-form-group" hidden="">
                            <label for="email-7b2e" class="u-label">Definition ID</label>
                            <input type="text" value="${defID}" id="email-7b2e" name="defID" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white">
                        </div>
                        <div class="u-form-group" hidden="">
                            <label for="email-7b2e" class="u-label">Language</label>
                            <input type="text" value="${language}" id="email-7b2e" name="language" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white">
                        </div>
                        <div class="u-form-group" hidden="">
                            <label for="email-7b2e" class="u-label">Word</label>
                            <input type="text" value="${def.getWord()}" id="email-7b2e" name="word" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white">
                        </div>
                        <div class="u-form-group u-form-select u-form-group-1">
                            <label for="select-c0b7" class="u-label">Part of Speech</label>
                            <div class="u-form-select-wrapper">
                                <select id="select-c0b7" name="pos" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white">
                                    <option value="1">noun</option>
                                    <option value="2">verb</option>
                                    <option value="3">adjective</option>
                                    <option value="4">determiner</option>
                                    <option value="5">adverb</option>
                                    <option value="6">pronoun</option>
                                    <option value="7">preposition</option>
                                    <option value="8">conjunction</option>
                                    <option value="9">interjection</option>
                                    <option value="10">(Japanese only) particle</option>
                                </select>
                                <svg class="u-caret u-caret-svg" version="1.1" id="Layer_1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" width="16px" height="16px" viewBox="0 0 16 16" style="fill:currentColor;" xml:space="preserve"><polygon class="st0" points="8,12 2,4 14,4 "></polygon></svg>
                            </div>
                        </div>
                        <div class="u-form-group u-form-message">
                            <label for="message-7b2e" class="u-label">Definition</label>
                            <textarea placeholder="Enter word's definition" rows="4" cols="50" id="message-7b2e" name="definition" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white">${def.getDefinition()}</textarea>
                        </div>
                        <div class="u-form-group">
                            <label for="email-7b2e" class="u-label">Example</label>
                            <input type="text" value="${def.getExample()}" placeholder="Give an example - add a translation if not English" id="email-7b2e" name="example" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white">
                        </div>
                        <div class="u-align-center u-form-group u-form-submit">
                            <input type="submit" value="Edit" class="u-border-none u-btn u-btn-submit u-button-style">
                        </div>
                    </form>
                </div>
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
