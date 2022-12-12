<%-- 
    Document   : AddWord
    Created on : Dec 12, 2022, 8:59:00 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="font-size: 16px;" lang="en"><head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="">
    <meta name="description" content="">
    <title>AddWord</title>
    <link rel="stylesheet" href="nicepage.css" media="screen">
<link rel="stylesheet" href="AddWord.css" media="screen">
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
    <meta property="og:title" content="AddWord">
    <meta property="og:type" content="website">
  </head>
  <body class="u-body u-xl-mode" data-lang="en">
      <header class="u-clearfix u-header u-white u-header" id="sec-9f90"><div class="u-clearfix u-sheet u-sheet-1">
                <a href="Front-Page.html" class="u-image u-logo u-image-1" data-image-width="300" data-image-height="300" title="Front Page">
                    <img src="images/logo.png" class="u-logo-image u-logo-image-1">
                </a>
                <nav class="u-menu u-menu-hamburger u-offcanvas u-menu-1" data-responsive-from="XL">
                    <div class="menu-collapse" style="font-size: 1rem; letter-spacing: 0px; font-weight: 700; text-transform: uppercase;">
                        <a class="u-button-style u-custom-active-border-color u-custom-border u-custom-border-color u-custom-borders u-custom-hover-border-color u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-text-active-color u-custom-text-color u-custom-text-hover-color u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="#" style="padding: 1px 16px; font-size: calc(1em + 2px);">
                            <svg class="u-svg-link" viewBox="0 0 24 24"><use xlink:href="#menu-hamburger"></use></svg>
                            <svg class="u-svg-content" version="1.1" id="menu-hamburger" viewBox="0 0 16 16" x="0px" y="0px" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns="http://www.w3.org/2000/svg"><g><rect y="1" width="16" height="2"></rect><rect y="7" width="16" height="2"></rect><rect y="13" width="16" height="2"></rect>
                            </g></svg>
                        </a>
                    </div>
                    <div class="u-nav-container">
                        <ul class="u-nav u-spacing-30 u-unstyled u-nav-1"><li class="u-nav-item"><a class="u-border-2 u-border-active-palette-3-base u-border-hover-palette-3-base u-border-no-left u-border-no-right u-border-no-top u-button-style u-nav-link u-text-active-palette-3-base u-text-grey-90 u-text-hover-grey-90" href="Front-Page.html" style="padding: 10px 1px 10px 0px;">Front Page</a>
                            </li></ul>
                    </div>
                    <div class="u-nav-container-collapse">
                        <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
                            <div class="u-inner-container-layout u-sidenav-overflow">
                                <div class="u-menu-close"></div>
                                <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2"><li class="u-nav-item"><a class="u-button-style u-nav-link" href="Front-Page.html">Front Page</a>
                                    </li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="/AddWord.html" style="padding: 10px 34px;">Add a new word or definition</a>
                                    </li></ul>
                            </div>
                        </div>
                        <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
                    </div>
                </nav>
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
            </div></header>
    <section class="u-clearfix u-gradient u-section-1" id="sec-0672">
      <div class="u-clearfix u-sheet u-sheet-1">
        <div class="u-form u-form-1">
            <form action="add" method="post" class="u-clearfix u-form-spacing-10 u-form-vertical u-inner-form" name="form" style="padding: 10px;">
            <div class="u-form-group u-form-select u-form-group-1">
              <label for="select-91d7" class="u-label">Language</label>
              <div class="u-form-select-wrapper">
                <select id="select-91d7" name="language" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="required">
                  <option value="english">English</option>
                  <option value="japanese">Japanese</option>
                  <option value="vietnamese">Vietnamese</option>
                </select>
                <svg class="u-caret u-caret-svg" version="1.1" id="Layer_1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" width="16px" height="16px" viewBox="0 0 16 16" style="fill:currentColor;" xml:space="preserve"><polygon class="st0" points="8,12 2,4 14,4 "></polygon></svg>
              </div>
            </div>
            <div class="u-form-group u-form-name">
              <label for="name-7b2e" class="u-label">Word</label>
              <input type="text" placeholder="Enter word" id="name-7b2e" name="word" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="required">
            </div>
            <div class="u-form-group u-form-group-3">
              <label for="text-def8" class="u-label">Roman Spelling (Japanese only)</label>
              <input type="text" placeholder="Enter roman spelling for your Japanese word" id="text-def8" name="romaaji" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white">
            </div>
            <div class="u-form-group u-form-select u-form-group-4">
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
                </select>
                <svg class="u-caret u-caret-svg" version="1.1" id="Layer_1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" width="16px" height="16px" viewBox="0 0 16 16" style="fill:currentColor;" xml:space="preserve"><polygon class="st0" points="8,12 2,4 14,4 "></polygon></svg>
              </div>
            </div>
            <div class="u-form-group u-form-message">
              <label for="message-7b2e" class="u-label">Definition</label>
              <textarea placeholder="Enter word's definition" rows="4" cols="50" id="message-7b2e" name="definition" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white"></textarea>
            </div>
            <div class="u-form-group">
              <label for="email-7b2e" class="u-label">Example</label>
              <input type="text" placeholder="Give an example of how to use the word" id="email-7b2e" name="example" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white">
            </div>
            <div class="u-align-center u-form-group u-form-submit">
              <input type="submit" value="Add" class="u-border-none u-btn u-btn-submit u-button-style">
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
