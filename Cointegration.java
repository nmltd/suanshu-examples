<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<title>/Examples/src/main/java/com/numericalmethod/suanshu/examples/Cointegration.java - Public - Redmine</title>
<meta name="description" content="Redmine" />
<meta name="keywords" content="issue,bug,tracker" />
<meta name="csrf-param" content="authenticity_token" />
<meta name="csrf-token" content="NBuHx9qWPo8tHdNSYSubpqEFuBwZasSdS6DdyER/FoF1rTTlN3u2DYVOWjgxdNI/tMgqR9aILHXBIpkuCP0YIg==" />
<link rel='shortcut icon' href='/favicon.ico' />
<link rel="stylesheet" media="all" href="/stylesheets/jquery/jquery-ui-1.11.0.css" />
<link rel="stylesheet" media="all" href="/stylesheets/application.css" />

<script src="/javascripts/jquery-1.11.1-ui-1.11.0-ujs-3.1.3.js"></script>
<script src="/javascripts/application.js"></script>
<script>
//<![CDATA[
$(window).load(function(){ warnLeavingUnsaved('The current page contains unsaved text that will be lost if you leave this page.'); });
//]]>
</script>


<!-- page specific tags -->
  <script src="/javascripts/repository_navigation.js"></script>
<link rel="stylesheet" media="screen" href="/stylesheets/scm.css" />
</head>
<body class="project-public controller-repositories action-entry">
<div id="wrapper">
<div id="wrapper2">
<div id="wrapper3">
<div id="top-menu">
    <div id="account">
        <ul><li><a class="my-account" href="/my/account">My account</a></li>
<li><a class="logout" rel="nofollow" data-method="post" href="/logout">Sign out</a></li></ul>    </div>
    <div id="loggedas">Logged in as <a class="user active" href="/users/3">haksun.li</a></div>
    <ul><li><a class="home" href="/">Home</a></li>
<li><a class="my-page" href="/my/page">My page</a></li>
<li><a class="projects" href="/projects">Projects</a></li>
<li><a class="help" href="http://www.redmine.org/guide">Help</a></li></ul></div>

<div id="header">
    <div id="quick-search">
        <form action="/projects/public/search" accept-charset="UTF-8" method="get"><input name="utf8" type="hidden" value="&#x2713;" />
        <input type="hidden" name="changesets" value="1" />
        <label for='q'>
          <a accesskey="4" href="/projects/public/search">Search</a>:
        </label>
        <input type="text" name="q" id="q" size="20" class="small" accesskey="f" />
</form>        <select name="project_quick_jump_box" id="project_quick_jump_box" onchange="if (this.value != &#39;&#39;) { window.location = this.value; }"><option value=''>Jump to a project...</option><option value="" disabled="disabled">---</option><option value="/projects/nm-fintech?jump=repository">NM FinTech</option><option value="/projects/23quant?jump=repository">&nbsp;&nbsp;&#187; 23Quant</option><option value="/projects/algoquant?jump=repository">&nbsp;&nbsp;&#187; AlgoQuant</option><option value="/projects/cqa?jump=repository">&nbsp;&nbsp;&#187; CQA</option><option value="/projects/factor-model?jump=repository">&nbsp;&nbsp;&#187; Factor Model</option><option value="/projects/nmrms?jump=repository">&nbsp;&nbsp;&#187; NMRMS</option><option value="/projects/portfolio-optimization?jump=repository">&nbsp;&nbsp;&#187; Portfolio Optimization</option><option value="/projects/supercurve?jump=repository">&nbsp;&nbsp;&#187; SuperCurve</option><option value="/projects/nm-optim?jump=repository">NM Optim</option><option value="/projects/njsteel?jump=repository">&nbsp;&nbsp;&#187; 南方钢铁</option><option value="/projects/nm-solver?jump=repository">NM Solver</option><option value="/projects/numerical-method-incorporation-limited?jump=repository">Numerical Method Incorporation Limited</option><option value="/projects/aqea?jump=repository">&nbsp;&nbsp;&#187; AQEA</option><option value="/projects/mimi?jump=repository">&nbsp;&nbsp;&#187; Mimi</option><option value="/projects/public?jump=repository" selected="selected">&nbsp;&nbsp;&#187; Public</option><option value="/projects/suanshu?jump=repository">&nbsp;&nbsp;&#187; SuanShu</option><option value="/projects/suanshu-cloud?jump=repository">&nbsp;&nbsp;&nbsp;&nbsp;&#187; SuanShu Cloud</option><option value="/projects/trading-strategy-research?jump=repository">&nbsp;&nbsp;&#187; Trading Strategy Research</option><option value="/projects/s2?jump=repository">S2</option></select>
    </div>

    <h1><a class="root" href="/projects/numerical-method-incorporation-limited?jump=repository">Numerical Method Incorporation Limited</a> » Public</h1>

    <div id="main-menu">
        <ul><li><a class="overview" href="/projects/public">Overview</a></li>
<li><a class="activity" href="/projects/public/activity">Activity</a></li>
<li><a class="issues" href="/projects/public/issues">Issues</a></li>
<li><a accesskey="7" class="new-issue" href="/projects/public/issues/new">New issue</a></li>
<li><a class="gantt" href="/projects/public/issues/gantt">Gantt</a></li>
<li><a class="calendar" href="/projects/public/issues/calendar">Calendar</a></li>
<li><a class="news" href="/projects/public/news">News</a></li>
<li><a class="documents" href="/projects/public/documents">Documents</a></li>
<li><a class="wiki" href="/projects/public/wiki">Wiki</a></li>
<li><a class="files" href="/projects/public/files">Files</a></li>
<li><a class="repository selected" href="/projects/public/repository">Repository</a></li>
<li><a class="settings" href="/projects/public/settings">Settings</a></li></ul>
    </div>
</div>

<div id="main" class="nosidebar">
    <div id="sidebar">
        
        
    </div>

    <div id="content">
        
        

<div class="contextual">
  
<a class="icon icon-stats" href="/projects/public/repository/statistics">Statistics</a>

<form id="revision_selector" action="/projects/public/repository/entry/Examples/src/main/java/com/numericalmethod/suanshu/examples/Cointegration.java" accept-charset="UTF-8" method="get"><input name="utf8" type="hidden" value="&#x2713;" />  <!-- Branches Dropdown -->


    | Revision: 
    <input type="text" name="rev" id="rev" size="8" />
</form>
</div>

<h2><a href="/projects/public/repository">svn-public</a>
    / <a href="/projects/public/repository/show/Examples">Examples</a>
    / <a href="/projects/public/repository/show/Examples/src">src</a>
    / <a href="/projects/public/repository/show/Examples/src/main">main</a>
    / <a href="/projects/public/repository/show/Examples/src/main/java">java</a>
    / <a href="/projects/public/repository/show/Examples/src/main/java/com">com</a>
    / <a href="/projects/public/repository/show/Examples/src/main/java/com/numericalmethod">numericalmethod</a>
    / <a href="/projects/public/repository/show/Examples/src/main/java/com/numericalmethod/suanshu">suanshu</a>
    / <a href="/projects/public/repository/show/Examples/src/main/java/com/numericalmethod/suanshu/examples">examples</a>
    / <a href="/projects/public/repository/changes/Examples/src/main/java/com/numericalmethod/suanshu/examples/Cointegration.java">Cointegration.java</a>


</h2>


<p>
<a href="/projects/public/repository/changes/Examples/src/main/java/com/numericalmethod/suanshu/examples/Cointegration.java">History</a> |
    View |
    <a href="/projects/public/repository/annotate/Examples/src/main/java/com/numericalmethod/suanshu/examples/Cointegration.java">Annotate</a> |
<a href="/projects/public/repository/raw/Examples/src/main/java/com/numericalmethod/suanshu/examples/Cointegration.java">Download</a>
(9.51 KB)
</p>



<div class="autoscroll">
<table class="filecontent syntaxhl">
<tbody>
  <tr id="L1">
    <th class="line-num">
      <a href="#L1">1</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">/*</span>
</pre>
    </td>
  </tr>
  <tr id="L2">
    <th class="line-num">
      <a href="#L2">2</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * Copyright (c) Numerical Method Inc.</span>
</pre>
    </td>
  </tr>
  <tr id="L3">
    <th class="line-num">
      <a href="#L3">3</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * http://www.numericalmethod.com/</span>
</pre>
    </td>
  </tr>
  <tr id="L4">
    <th class="line-num">
      <a href="#L4">4</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> *</span>
</pre>
    </td>
  </tr>
  <tr id="L5">
    <th class="line-num">
      <a href="#L5">5</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * THIS SOFTWARE IS LICENSED, NOT SOLD.</span>
</pre>
    </td>
  </tr>
  <tr id="L6">
    <th class="line-num">
      <a href="#L6">6</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> *</span>
</pre>
    </td>
  </tr>
  <tr id="L7">
    <th class="line-num">
      <a href="#L7">7</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * YOU MAY USE THIS SOFTWARE ONLY AS DESCRIBED IN THE LICENSE.</span>
</pre>
    </td>
  </tr>
  <tr id="L8">
    <th class="line-num">
      <a href="#L8">8</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * IF YOU ARE NOT AWARE OF AND/OR DO NOT AGREE TO THE TERMS OF THE LICENSE,</span>
</pre>
    </td>
  </tr>
  <tr id="L9">
    <th class="line-num">
      <a href="#L9">9</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * DO NOT USE THIS SOFTWARE.</span>
</pre>
    </td>
  </tr>
  <tr id="L10">
    <th class="line-num">
      <a href="#L10">10</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> *</span>
</pre>
    </td>
  </tr>
  <tr id="L11">
    <th class="line-num">
      <a href="#L11">11</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * THE SOFTWARE IS PROVIDED &quot;AS IS&quot;, WITH NO WARRANTY WHATSOEVER,</span>
</pre>
    </td>
  </tr>
  <tr id="L12">
    <th class="line-num">
      <a href="#L12">12</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * EITHER EXPRESS OR IMPLIED, INCLUDING, WITHOUT LIMITATION,</span>
</pre>
    </td>
  </tr>
  <tr id="L13">
    <th class="line-num">
      <a href="#L13">13</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * ANY WARRANTIES OF ACCURACY, ACCESSIBILITY, COMPLETENESS,</span>
</pre>
    </td>
  </tr>
  <tr id="L14">
    <th class="line-num">
      <a href="#L14">14</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * FITNESS FOR A PARTICULAR PURPOSE, MERCHANTABILITY, NON-INFRINGEMENT,</span>
</pre>
    </td>
  </tr>
  <tr id="L15">
    <th class="line-num">
      <a href="#L15">15</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * TITLE AND USEFULNESS.</span>
</pre>
    </td>
  </tr>
  <tr id="L16">
    <th class="line-num">
      <a href="#L16">16</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> *</span>
</pre>
    </td>
  </tr>
  <tr id="L17">
    <th class="line-num">
      <a href="#L17">17</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * IN NO EVENT AND UNDER NO LEGAL THEORY,</span>
</pre>
    </td>
  </tr>
  <tr id="L18">
    <th class="line-num">
      <a href="#L18">18</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * WHETHER IN ACTION, CONTRACT, NEGLIGENCE, TORT, OR OTHERWISE,</span>
</pre>
    </td>
  </tr>
  <tr id="L19">
    <th class="line-num">
      <a href="#L19">19</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR</span>
</pre>
    </td>
  </tr>
  <tr id="L20">
    <th class="line-num">
      <a href="#L20">20</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * ANY CLAIMS, DAMAGES OR OTHER LIABILITIES,</span>
</pre>
    </td>
  </tr>
  <tr id="L21">
    <th class="line-num">
      <a href="#L21">21</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * ARISING AS A RESULT OF USING OR OTHER DEALINGS IN THE SOFTWARE.</span>
</pre>
    </td>
  </tr>
  <tr id="L22">
    <th class="line-num">
      <a href="#L22">22</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> */</span>
</pre>
    </td>
  </tr>
  <tr id="L23">
    <th class="line-num">
      <a href="#L23">23</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">package</span> <span class="namespace">com.numericalmethod.suanshu.examples</span>;
</pre>
    </td>
  </tr>
  <tr id="L24">
    <th class="line-num">
      <a href="#L24">24</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L25">
    <th class="line-num">
      <a href="#L25">25</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.algebra.linear.vector.doubles.Vector</span>;
</pre>
    </td>
  </tr>
  <tr id="L26">
    <th class="line-num">
      <a href="#L26">26</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.stats.cointegration</span>.*;
</pre>
    </td>
  </tr>
  <tr id="L27">
    <th class="line-num">
      <a href="#L27">27</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.stats.timeseries.datastructure.multivariate.realtime.inttime.MultivariateSimpleTimeSeries</span>;
</pre>
    </td>
  </tr>
  <tr id="L28">
    <th class="line-num">
      <a href="#L28">28</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L29">
    <th class="line-num">
      <a href="#L29">29</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L30">
    <th class="line-num">
      <a href="#L30">30</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * Demonstrates how to compute the cointegrating factors (beta) and adjustment factors (alpha) for a</span>
</pre>
    </td>
  </tr>
  <tr id="L31">
    <th class="line-num">
      <a href="#L31">31</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * system of multivariate time series.</span>
</pre>
    </td>
  </tr>
  <tr id="L32">
    <th class="line-num">
      <a href="#L32">32</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> *</span>
</pre>
    </td>
  </tr>
  <tr id="L33">
    <th class="line-num">
      <a href="#L33">33</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * @author Haksun Li</span>
</pre>
    </td>
  </tr>
  <tr id="L34">
    <th class="line-num">
      <a href="#L34">34</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> */</span>
</pre>
    </td>
  </tr>
  <tr id="L35">
    <th class="line-num">
      <a href="#L35">35</a>
    </th>
    <td class="line-code">
      <pre><span class="directive">public</span> <span class="directive">final</span> <span class="type">class</span> <span class="class">Cointegration</span> {
</pre>
    </td>
  </tr>
  <tr id="L36">
    <th class="line-num">
      <a href="#L36">36</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L37">
    <th class="line-num">
      <a href="#L37">37</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L38">
    <th class="line-num">
      <a href="#L38">38</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * We use the example from Søren Johansen. Likelihood-Based Inference in Cointegrated Vector</span>
</pre>
    </td>
  </tr>
  <tr id="L39">
    <th class="line-num">
      <a href="#L39">39</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * Autoregressive Models. Oxford University Press, USA. February 1, 1996.</span>
</pre>
    </td>
  </tr>
  <tr id="L40">
    <th class="line-num">
      <a href="#L40">40</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     *</span>
</pre>
    </td>
  </tr>
  <tr id="L41">
    <th class="line-num">
      <a href="#L41">41</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * This values are obtained from R output of the following script:</span>
</pre>
    </td>
  </tr>
  <tr id="L42">
    <th class="line-num">
      <a href="#L42">42</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     *</span>
</pre>
    </td>
  </tr>
  <tr id="L43">
    <th class="line-num">
      <a href="#L43">43</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * library(urca) data(finland) sjf &amp;lt;- finland summary(ca.jo(sjf, ecdet = &quot;none&quot;,</span>
</pre>
    </td>
  </tr>
  <tr id="L44">
    <th class="line-num">
      <a href="#L44">44</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * type=&quot;eigen&quot;, K=2))</span>
</pre>
    </td>
  </tr>
  <tr id="L45">
    <th class="line-num">
      <a href="#L45">45</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L46">
    <th class="line-num">
      <a href="#L46">46</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="directive">final</span> MultivariateSimpleTimeSeries FINLAND =
</pre>
    </td>
  </tr>
  <tr id="L47">
    <th class="line-num">
      <a href="#L47">47</a>
    </th>
    <td class="line-code">
      <pre>            <span class="keyword">new</span> MultivariateSimpleTimeSeries(<span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span><span class="type">[]</span>{
</pre>
    </td>
  </tr>
  <tr id="L48">
    <th class="line-num">
      <a href="#L48">48</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">2.848664</span>, <span class="float">3.836539</span>, <span class="float">0.1731126</span>, <span class="float">0.01481509</span>},
</pre>
    </td>
  </tr>
  <tr id="L49">
    <th class="line-num">
      <a href="#L49">49</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">2.82801</span>, <span class="float">3.902982</span>, <span class="float">0.1012019</span>, <span class="integer">0</span>},
</pre>
    </td>
  </tr>
  <tr id="L50">
    <th class="line-num">
      <a href="#L50">50</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">2.908186</span>, <span class="float">3.89688</span>, <span class="float">0.1320803</span>, <span class="integer">0</span>},
</pre>
    </td>
  </tr>
  <tr id="L51">
    <th class="line-num">
      <a href="#L51">51</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">2.934326</span>, <span class="float">3.847045</span>, <span class="float">0.06999237</span>, <span class="integer">0</span>},
</pre>
    </td>
  </tr>
  <tr id="L52">
    <th class="line-num">
      <a href="#L52">52</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">2.986127</span>, <span class="float">3.916454</span>, <span class="float">0.06531947</span>, <span class="integer">0</span>},
</pre>
    </td>
  </tr>
  <tr id="L53">
    <th class="line-num">
      <a href="#L53">53</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.006543</span>, <span class="float">3.986216</span>, <span class="float">0.06531947</span>, <span class="float">0.0145988</span>},
</pre>
    </td>
  </tr>
  <tr id="L54">
    <th class="line-num">
      <a href="#L54">54</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.016235</span>, <span class="float">3.984211</span>, <span class="float">0.06531947</span>, <span class="float">0.01438874</span>},
</pre>
    </td>
  </tr>
  <tr id="L55">
    <th class="line-num">
      <a href="#L55">55</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">2.95403</span>, <span class="float">3.956458</span>, <span class="float">0.06531947</span>, <span class="float">0.01418463</span>},
</pre>
    </td>
  </tr>
  <tr id="L56">
    <th class="line-num">
      <a href="#L56">56</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.00275</span>, <span class="float">3.990079</span>, <span class="float">0.1612681</span>, <span class="integer">0</span>},
</pre>
    </td>
  </tr>
  <tr id="L57">
    <th class="line-num">
      <a href="#L57">57</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.041873</span>, <span class="float">4.048979</span>, <span class="float">0.243495</span>, <span class="float">0.01398624</span>},
</pre>
    </td>
  </tr>
  <tr id="L58">
    <th class="line-num">
      <a href="#L58">58</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.033884</span>, <span class="float">4.053306</span>, <span class="float">0.1633086</span>, <span class="integer">0</span>},
</pre>
    </td>
  </tr>
  <tr id="L59">
    <th class="line-num">
      <a href="#L59">59</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.058968</span>, <span class="float">4.066436</span>, <span class="float">0.1101092</span>, <span class="integer">0</span>},
</pre>
    </td>
  </tr>
  <tr id="L60">
    <th class="line-num">
      <a href="#L60">60</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.03522</span>, <span class="float">4.088541</span>, <span class="float">0.1224831</span>, <span class="integer">0</span>},
</pre>
    </td>
  </tr>
  <tr id="L61">
    <th class="line-num">
      <a href="#L61">61</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.087247</span>, <span class="float">4.146216</span>, <span class="float">0.1173385</span>, <span class="integer">0</span>},
</pre>
    </td>
  </tr>
  <tr id="L62">
    <th class="line-num">
      <a href="#L62">62</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.100822</span>, <span class="float">4.125302</span>, <span class="float">0.1476438</span>, <span class="float">0.02739897</span>},
</pre>
    </td>
  </tr>
  <tr id="L63">
    <th class="line-num">
      <a href="#L63">63</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.05858</span>, <span class="float">4.108145</span>, <span class="float">0.1752969</span>, <span class="integer">0</span>},
</pre>
    </td>
  </tr>
  <tr id="L64">
    <th class="line-num">
      <a href="#L64">64</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.039497</span>, <span class="float">4.095878</span>, <span class="float">0.2291256</span>, <span class="float">0.02666825</span>},
</pre>
    </td>
  </tr>
  <tr id="L65">
    <th class="line-num">
      <a href="#L65">65</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.07537</span>, <span class="float">4.157463</span>, <span class="float">0.242397</span>, <span class="integer">0</span>},
</pre>
    </td>
  </tr>
  <tr id="L66">
    <th class="line-num">
      <a href="#L66">66</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.107436</span>, <span class="float">4.159411</span>, <span class="float">0.2403546</span>, <span class="float">0.01307208</span>},
</pre>
    </td>
  </tr>
  <tr id="L67">
    <th class="line-num">
      <a href="#L67">67</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.137721</span>, <span class="float">4.100841</span>, <span class="float">0.210909</span>, <span class="float">0.0129034</span>},
</pre>
    </td>
  </tr>
  <tr id="L68">
    <th class="line-num">
      <a href="#L68">68</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.127759</span>, <span class="float">4.169761</span>, <span class="float">0.1712606</span>, <span class="float">0.01273903</span>},
</pre>
    </td>
  </tr>
  <tr id="L69">
    <th class="line-num">
      <a href="#L69">69</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.128404</span>, <span class="float">4.199699</span>, <span class="float">0.1891316</span>, <span class="float">0.01257878</span>},
</pre>
    </td>
  </tr>
  <tr id="L70">
    <th class="line-num">
      <a href="#L70">70</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.199932</span>, <span class="float">4.197109</span>, <span class="float">0.1706706</span>, <span class="float">0.01242252</span>},
</pre>
    </td>
  </tr>
  <tr id="L71">
    <th class="line-num">
      <a href="#L71">71</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.068053</span>, <span class="float">4.178529</span>, <span class="float">0.1367138</span>, <span class="float">0.05989814</span>},
</pre>
    </td>
  </tr>
  <tr id="L72">
    <th class="line-num">
      <a href="#L72">72</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.072799</span>, <span class="float">4.178418</span>, <span class="float">0.1686451</span>, <span class="float">0.02298952</span>},
</pre>
    </td>
  </tr>
  <tr id="L73">
    <th class="line-num">
      <a href="#L73">73</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.084895</span>, <span class="float">4.192901</span>, <span class="float">0.1779788</span>, <span class="float">0.01129956</span>},
</pre>
    </td>
  </tr>
  <tr id="L74">
    <th class="line-num">
      <a href="#L74">74</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.135006</span>, <span class="float">4.260383</span>, <span class="float">0.1972102</span>, <span class="integer">0</span>},
</pre>
    </td>
  </tr>
  <tr id="L75">
    <th class="line-num">
      <a href="#L75">75</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.099091</span>, <span class="float">4.222265</span>, <span class="float">0.1833211</span>, <span class="float">0.0111733</span>},
</pre>
    </td>
  </tr>
  <tr id="L76">
    <th class="line-num">
      <a href="#L76">76</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.090548</span>, <span class="float">4.219907</span>, <span class="float">0.1354046</span>, <span class="float">0.02197891</span>},
</pre>
    </td>
  </tr>
  <tr id="L77">
    <th class="line-num">
      <a href="#L77">77</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.078614</span>, <span class="float">4.276832</span>, <span class="float">0.06765865</span>, <span class="integer">0</span>},
</pre>
    </td>
  </tr>
  <tr id="L78">
    <th class="line-num">
      <a href="#L78">78</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.110883</span>, <span class="float">4.293151</span>, <span class="float">0.06765865</span>, <span class="float">0.01081092</span>},
</pre>
    </td>
  </tr>
  <tr id="L79">
    <th class="line-num">
      <a href="#L79">79</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.024568</span>, <span class="float">4.199678</span>, <span class="float">0.06765865</span>, <span class="float">0.01069529</span>},
</pre>
    </td>
  </tr>
  <tr id="L80">
    <th class="line-num">
      <a href="#L80">80</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.083357</span>, <span class="float">4.276213</span>, <span class="float">0.1153802</span>, <span class="float">0.01058211</span>},
</pre>
    </td>
  </tr>
  <tr id="L81">
    <th class="line-num">
      <a href="#L81">81</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.04108</span>, <span class="float">4.299289</span>, <span class="float">0.2200187</span>, <span class="float">0.02083409</span>},
</pre>
    </td>
  </tr>
  <tr id="L82">
    <th class="line-num">
      <a href="#L82">82</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.117137</span>, <span class="float">4.341603</span>, <span class="float">0.2944591</span>, <span class="float">0.0102565</span>},
</pre>
    </td>
  </tr>
  <tr id="L83">
    <th class="line-num">
      <a href="#L83">83</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.026565</span>, <span class="float">4.293609</span>, <span class="float">0.06765865</span>, <span class="float">0.01015237</span>},
</pre>
    </td>
  </tr>
  <tr id="L84">
    <th class="line-num">
      <a href="#L84">84</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.046901</span>, <span class="float">4.315433</span>, <span class="float">0.1218636</span>, <span class="float">0.01005034</span>},
</pre>
    </td>
  </tr>
  <tr id="L85">
    <th class="line-num">
      <a href="#L85">85</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">2.99375</span>, <span class="float">4.32215</span>, <span class="float">0.09184965</span>, <span class="float">0.009950331</span>},
</pre>
    </td>
  </tr>
  <tr id="L86">
    <th class="line-num">
      <a href="#L86">86</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.006729</span>, <span class="float">4.312939</span>, <span class="float">0.1208893</span>, <span class="float">0.02927038</span>},
</pre>
    </td>
  </tr>
  <tr id="L87">
    <th class="line-num">
      <a href="#L87">87</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">2.991557</span>, <span class="float">4.30584</span>, <span class="float">0.09166719</span>, <span class="float">0.03774033</span>},
</pre>
    </td>
  </tr>
  <tr id="L88">
    <th class="line-num">
      <a href="#L88">88</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.047116</span>, <span class="float">4.333206</span>, <span class="float">0.06765865</span>, <span class="float">0.01834914</span>},
</pre>
    </td>
  </tr>
  <tr id="L89">
    <th class="line-num">
      <a href="#L89">89</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.073535</span>, <span class="float">4.380844</span>, <span class="float">0.06765865</span>, <span class="integer">0</span>},
</pre>
    </td>
  </tr>
  <tr id="L90">
    <th class="line-num">
      <a href="#L90">90</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.180678</span>, <span class="float">4.3923</span>, <span class="float">0.06765865</span>, <span class="float">0.009049836</span>},
</pre>
    </td>
  </tr>
  <tr id="L91">
    <th class="line-num">
      <a href="#L91">91</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.135102</span>, <span class="float">4.420402</span>, <span class="float">0.06765865</span>, <span class="integer">0</span>},
</pre>
    </td>
  </tr>
  <tr id="L92">
    <th class="line-num">
      <a href="#L92">92</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.193558</span>, <span class="float">4.4441</span>, <span class="float">0.06765865</span>, <span class="float">0.00896867</span>},
</pre>
    </td>
  </tr>
  <tr id="L93">
    <th class="line-num">
      <a href="#L93">93</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.196119</span>, <span class="float">4.489679</span>, <span class="float">0.06765865</span>, <span class="integer">0</span>},
</pre>
    </td>
  </tr>
  <tr id="L94">
    <th class="line-num">
      <a href="#L94">94</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.333479</span>, <span class="float">4.518776</span>, <span class="float">0.0719485</span>, <span class="integer">0</span>},
</pre>
    </td>
  </tr>
  <tr id="L95">
    <th class="line-num">
      <a href="#L95">95</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.411379</span>, <span class="float">4.490783</span>, <span class="float">0.08231704</span>, <span class="float">0.01769958</span>},
</pre>
    </td>
  </tr>
  <tr id="L96">
    <th class="line-num">
      <a href="#L96">96</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.459963</span>, <span class="float">4.536882</span>, <span class="float">0.1513468</span>, <span class="integer">0</span>},
</pre>
    </td>
  </tr>
  <tr id="L97">
    <th class="line-num">
      <a href="#L97">97</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.451505</span>, <span class="float">4.561972</span>, <span class="float">0.2311117</span>, <span class="float">0.00873368</span>},
</pre>
    </td>
  </tr>
  <tr id="L98">
    <th class="line-num">
      <a href="#L98">98</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.530157</span>, <span class="float">4.619116</span>, <span class="float">0.1854001</span>, <span class="float">0.008658063</span>},
</pre>
    </td>
  </tr>
  <tr id="L99">
    <th class="line-num">
      <a href="#L99">99</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.297392</span>, <span class="float">4.51013</span>, <span class="float">0.07927318</span>, <span class="float">0.0255333</span>},
</pre>
    </td>
  </tr>
  <tr id="L100">
    <th class="line-num">
      <a href="#L100">100</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.280233</span>, <span class="float">4.575117</span>, <span class="float">0.1179608</span>, <span class="float">0.02489755</span>},
</pre>
    </td>
  </tr>
  <tr id="L101">
    <th class="line-num">
      <a href="#L101">101</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.307619</span>, <span class="float">4.569593</span>, <span class="float">0.09285262</span>, <span class="float">0.02429269</span>},
</pre>
    </td>
  </tr>
  <tr id="L102">
    <th class="line-num">
      <a href="#L102">102</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.451498</span>, <span class="float">4.631627</span>, <span class="float">0.08157999</span>, <span class="float">0.00796817</span>},
</pre>
    </td>
  </tr>
  <tr id="L103">
    <th class="line-num">
      <a href="#L103">103</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.437284</span>, <span class="float">4.60271</span>, <span class="float">0.07464354</span>, <span class="float">0.00790518</span>},
</pre>
    </td>
  </tr>
  <tr id="L104">
    <th class="line-num">
      <a href="#L104">104</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.485342</span>, <span class="float">4.62328</span>, <span class="float">0.07464354</span>, <span class="float">0.03101024</span>},
</pre>
    </td>
  </tr>
  <tr id="L105">
    <th class="line-num">
      <a href="#L105">105</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.500827</span>, <span class="float">4.64374</span>, <span class="float">0.07464354</span>, <span class="float">0.01515181</span>},
</pre>
    </td>
  </tr>
  <tr id="L106">
    <th class="line-num">
      <a href="#L106">106</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.606705</span>, <span class="float">4.715684</span>, <span class="float">0.07464354</span>, <span class="float">0.01492565</span>},
</pre>
    </td>
  </tr>
  <tr id="L107">
    <th class="line-num">
      <a href="#L107">107</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.508857</span>, <span class="float">4.689491</span>, <span class="float">0.07464354</span>, <span class="float">0.02919915</span>},
</pre>
    </td>
  </tr>
  <tr id="L108">
    <th class="line-num">
      <a href="#L108">108</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.580815</span>, <span class="float">4.691851</span>, <span class="float">0.07464354</span>, <span class="float">0.03533937</span>},
</pre>
    </td>
  </tr>
  <tr id="L109">
    <th class="line-num">
      <a href="#L109">109</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.494112</span>, <span class="float">4.703741</span>, <span class="float">0.09558287</span>, <span class="float">0.05406722</span>},
</pre>
    </td>
  </tr>
  <tr id="L110">
    <th class="line-num">
      <a href="#L110">110</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.66848</span>, <span class="float">4.80992</span>, <span class="float">0.2311117</span>, <span class="float">0.02597549</span>},
</pre>
    </td>
  </tr>
  <tr id="L111">
    <th class="line-num">
      <a href="#L111">111</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.49595</span>, <span class="float">4.745103</span>, <span class="float">0.1684761</span>, <span class="float">0.04389419</span>},
</pre>
    </td>
  </tr>
  <tr id="L112">
    <th class="line-num">
      <a href="#L112">112</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.553317</span>, <span class="float">4.809414</span>, <span class="float">0.1478164</span>, <span class="float">0.03614851</span>},
</pre>
    </td>
  </tr>
  <tr id="L113">
    <th class="line-num">
      <a href="#L113">113</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.536008</span>, <span class="float">4.751507</span>, <span class="float">0.08993211</span>, <span class="float">0.05748709</span>},
</pre>
    </td>
  </tr>
  <tr id="L114">
    <th class="line-num">
      <a href="#L114">114</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.689291</span>, <span class="float">4.880777</span>, <span class="float">0.1377599</span>, <span class="float">0.01662088</span>},
</pre>
    </td>
  </tr>
  <tr id="L115">
    <th class="line-num">
      <a href="#L115">115</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.64695</span>, <span class="float">4.762205</span>, <span class="float">0.1298873</span>, <span class="float">0.0586835</span>},
</pre>
    </td>
  </tr>
  <tr id="L116">
    <th class="line-num">
      <a href="#L116">116</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.66369</span>, <span class="float">4.81644</span>, <span class="float">0.1754648</span>, <span class="float">0.03562718</span>},
</pre>
    </td>
  </tr>
  <tr id="L117">
    <th class="line-num">
      <a href="#L117">117</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.565684</span>, <span class="float">4.757928</span>, <span class="float">0.1619488</span>, <span class="float">0.04401689</span>},
</pre>
    </td>
  </tr>
  <tr id="L118">
    <th class="line-num">
      <a href="#L118">118</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.783132</span>, <span class="float">4.807621</span>, <span class="float">0.2462349</span>, <span class="float">0.02830378</span>},
</pre>
    </td>
  </tr>
  <tr id="L119">
    <th class="line-num">
      <a href="#L119">119</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.641322</span>, <span class="float">4.695385</span>, <span class="float">0.1785645</span>, <span class="float">0.04546237</span>},
</pre>
    </td>
  </tr>
  <tr id="L120">
    <th class="line-num">
      <a href="#L120">120</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.6362</span>, <span class="float">4.77279</span>, <span class="float">0.1779788</span>, <span class="float">0.01324523</span>},
</pre>
    </td>
  </tr>
  <tr id="L121">
    <th class="line-num">
      <a href="#L121">121</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.580232</span>, <span class="float">4.766532</span>, <span class="float">0.1593941</span>, <span class="float">0.03871451</span>},
</pre>
    </td>
  </tr>
  <tr id="L122">
    <th class="line-num">
      <a href="#L122">122</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.647325</span>, <span class="float">4.842663</span>, <span class="float">0.1674617</span>, <span class="float">0.02087759</span>},
</pre>
    </td>
  </tr>
  <tr id="L123">
    <th class="line-num">
      <a href="#L123">123</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.629197</span>, <span class="float">4.695384</span>, <span class="float">0.1413259</span>, <span class="float">0.04049136</span>},
</pre>
    </td>
  </tr>
  <tr id="L124">
    <th class="line-num">
      <a href="#L124">124</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.64542</span>, <span class="float">4.732926</span>, <span class="float">0.1524635</span>, <span class="float">0.03509132</span>},
</pre>
    </td>
  </tr>
  <tr id="L125">
    <th class="line-num">
      <a href="#L125">125</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.585797</span>, <span class="float">4.729782</span>, <span class="float">0.1655144</span>, <span class="float">0.02646657</span>},
</pre>
    </td>
  </tr>
  <tr id="L126">
    <th class="line-num">
      <a href="#L126">126</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.595339</span>, <span class="float">4.801802</span>, <span class="float">0.18057</span>, <span class="float">0.01113184</span>},
</pre>
    </td>
  </tr>
  <tr id="L127">
    <th class="line-num">
      <a href="#L127">127</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.599353</span>, <span class="float">4.698796</span>, <span class="float">0.1707549</span>, <span class="float">0.01465228</span>},
</pre>
    </td>
  </tr>
  <tr id="L128">
    <th class="line-num">
      <a href="#L128">128</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.693067</span>, <span class="float">4.762504</span>, <span class="float">0.09148469</span>, <span class="float">0.01801851</span>},
</pre>
    </td>
  </tr>
  <tr id="L129">
    <th class="line-num">
      <a href="#L129">129</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.66311</span>, <span class="float">4.739455</span>, <span class="float">0.08709471</span>, <span class="float">0.01418463</span>},
</pre>
    </td>
  </tr>
  <tr id="L130">
    <th class="line-num">
      <a href="#L130">130</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.693763</span>, <span class="float">4.84324</span>, <span class="float">0.09285262</span>, <span class="float">0.007017573</span>},
</pre>
    </td>
  </tr>
  <tr id="L131">
    <th class="line-num">
      <a href="#L131">131</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.661466</span>, <span class="float">4.771751</span>, <span class="float">0.08056565</span>, <span class="float">0.02758796</span>},
</pre>
    </td>
  </tr>
  <tr id="L132">
    <th class="line-num">
      <a href="#L132">132</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.789403</span>, <span class="float">4.84193</span>, <span class="float">0.08038111</span>, <span class="float">0.02020271</span>},
</pre>
    </td>
  </tr>
  <tr id="L133">
    <th class="line-num">
      <a href="#L133">133</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.752624</span>, <span class="float">4.81652</span>, <span class="float">0.08111905</span>, <span class="float">0.0165293</span>},
</pre>
    </td>
  </tr>
  <tr id="L134">
    <th class="line-num">
      <a href="#L134">134</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.813215</span>, <span class="float">4.890468</span>, <span class="float">0.1118991</span>, <span class="float">0.01948114</span>},
</pre>
    </td>
  </tr>
  <tr id="L135">
    <th class="line-num">
      <a href="#L135">135</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.72502</span>, <span class="float">4.785139</span>, <span class="float">0.1160927</span>, <span class="float">0.03475863</span>},
</pre>
    </td>
  </tr>
  <tr id="L136">
    <th class="line-num">
      <a href="#L136">136</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.770843</span>, <span class="float">4.837455</span>, <span class="float">0.139066</span>, <span class="float">0.04255961</span>},
</pre>
    </td>
  </tr>
  <tr id="L137">
    <th class="line-num">
      <a href="#L137">137</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.713289</span>, <span class="float">4.86724</span>, <span class="float">0.1483338</span>, <span class="float">0.02643326</span>},
</pre>
    </td>
  </tr>
  <tr id="L138">
    <th class="line-num">
      <a href="#L138">138</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.745108</span>, <span class="float">4.922232</span>, <span class="float">0.1531502</span>, <span class="float">0.0257525</span>},
</pre>
    </td>
  </tr>
  <tr id="L139">
    <th class="line-num">
      <a href="#L139">139</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.722089</span>, <span class="float">4.799556</span>, <span class="float">0.1633086</span>, <span class="float">0.03060044</span>},
</pre>
    </td>
  </tr>
  <tr id="L140">
    <th class="line-num">
      <a href="#L140">140</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.733176</span>, <span class="float">4.875043</span>, <span class="float">0.1217751</span>, <span class="float">0.03234783</span>},
</pre>
    </td>
  </tr>
  <tr id="L141">
    <th class="line-num">
      <a href="#L141">141</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.73251</span>, <span class="float">4.868998</span>, <span class="float">0.1244276</span>, <span class="float">0.01839737</span>},
</pre>
    </td>
  </tr>
  <tr id="L142">
    <th class="line-num">
      <a href="#L142">142</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.788271</span>, <span class="float">4.936803</span>, <span class="float">0.1403705</span>, <span class="float">0.01293679</span>},
</pre>
    </td>
  </tr>
  <tr id="L143">
    <th class="line-num">
      <a href="#L143">143</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.705715</span>, <span class="float">4.802846</span>, <span class="float">0.1309405</span>, <span class="float">0.03287275</span>},
</pre>
    </td>
  </tr>
  <tr id="L144">
    <th class="line-num">
      <a href="#L144">144</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.813328</span>, <span class="float">4.890625</span>, <span class="float">0.1293602</span>, <span class="float">0.02457126</span>},
</pre>
    </td>
  </tr>
  <tr id="L145">
    <th class="line-num">
      <a href="#L145">145</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.821703</span>, <span class="float">4.891206</span>, <span class="float">0.1282173</span>, <span class="float">0.007255171</span>},
</pre>
    </td>
  </tr>
  <tr id="L146">
    <th class="line-num">
      <a href="#L146">146</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.849595</span>, <span class="float">4.96843</span>, <span class="float">0.1410654</span>, <span class="float">0.02145494</span>},
</pre>
    </td>
  </tr>
  <tr id="L147">
    <th class="line-num">
      <a href="#L147">147</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.80396</span>, <span class="float">4.834531</span>, <span class="float">0.1339188</span>, <span class="float">0.01938634</span>},
</pre>
    </td>
  </tr>
  <tr id="L148">
    <th class="line-num">
      <a href="#L148">148</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.863014</span>, <span class="float">4.923077</span>, <span class="float">0.1397619</span>, <span class="float">0.03723472</span>},
</pre>
    </td>
  </tr>
  <tr id="L149">
    <th class="line-num">
      <a href="#L149">149</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.852309</span>, <span class="float">4.93591</span>, <span class="float">0.1445332</span>, <span class="float">0.01262335</span>},
</pre>
    </td>
  </tr>
  <tr id="L150">
    <th class="line-num">
      <a href="#L150">150</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.826078</span>, <span class="float">4.980688</span>, <span class="float">0.1551216</span>, <span class="float">0.02735139</span>},
</pre>
    </td>
  </tr>
  <tr id="L151">
    <th class="line-num">
      <a href="#L151">151</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.782735</span>, <span class="float">4.866376</span>, <span class="float">0.1612681</span>, <span class="float">0.004273511</span>},
</pre>
    </td>
  </tr>
  <tr id="L152">
    <th class="line-num">
      <a href="#L152">152</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.830368</span>, <span class="float">4.959666</span>, <span class="float">0.1544364</span>, <span class="float">0.01900796</span>},
</pre>
    </td>
  </tr>
  <tr id="L153">
    <th class="line-num">
      <a href="#L153">153</a>
    </th>
    <td class="line-code">
      <pre>                {<span class="float">3.825409</span>, <span class="float">4.95232</span>, <span class="float">0.1516905</span>, <span class="float">0.01453816</span>}
</pre>
    </td>
  </tr>
  <tr id="L154">
    <th class="line-num">
      <a href="#L154">154</a>
    </th>
    <td class="line-code">
      <pre>            });
</pre>
    </td>
  </tr>
  <tr id="L155">
    <th class="line-num">
      <a href="#L155">155</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L156">
    <th class="line-num">
      <a href="#L156">156</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">private</span> Cointegration() {
</pre>
    </td>
  </tr>
  <tr id="L157">
    <th class="line-num">
      <a href="#L157">157</a>
    </th>
    <td class="line-code">
      <pre>    }
</pre>
    </td>
  </tr>
  <tr id="L158">
    <th class="line-num">
      <a href="#L158">158</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L159">
    <th class="line-num">
      <a href="#L159">159</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L160">
    <th class="line-num">
      <a href="#L160">160</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * Runs cointegration on the data in {@link #FINLAND}.</span>
</pre>
    </td>
  </tr>
  <tr id="L161">
    <th class="line-num">
      <a href="#L161">161</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     *</span>
</pre>
    </td>
  </tr>
  <tr id="L162">
    <th class="line-num">
      <a href="#L162">162</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param args not used</span>
</pre>
    </td>
  </tr>
  <tr id="L163">
    <th class="line-num">
      <a href="#L163">163</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L164">
    <th class="line-num">
      <a href="#L164">164</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="type">void</span> main(<span class="predefined-type">String</span><span class="type">[]</span> args) {
</pre>
    </td>
  </tr>
  <tr id="L165">
    <th class="line-num">
      <a href="#L165">165</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.println(<span class="string"><span class="delimiter">&quot;</span><span class="content">This class demonstrates how to compute the cointegrating factors (beta)</span><span class="delimiter">&quot;</span></span>
</pre>
    </td>
  </tr>
  <tr id="L166">
    <th class="line-num">
      <a href="#L166">166</a>
    </th>
    <td class="line-code">
      <pre>                           + <span class="string"><span class="delimiter">&quot;</span><span class="content"> and adjustment factors (alpha) for a system of multivariate time series.</span><span class="delimiter">&quot;</span></span>);
</pre>
    </td>
  </tr>
  <tr id="L167">
    <th class="line-num">
      <a href="#L167">167</a>
    </th>
    <td class="line-code">
      <pre>        cointegration(FINLAND);
</pre>
    </td>
  </tr>
  <tr id="L168">
    <th class="line-num">
      <a href="#L168">168</a>
    </th>
    <td class="line-code">
      <pre>    }
</pre>
    </td>
  </tr>
  <tr id="L169">
    <th class="line-num">
      <a href="#L169">169</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L170">
    <th class="line-num">
      <a href="#L170">170</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L171">
    <th class="line-num">
      <a href="#L171">171</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * Computes the cointegration of a system of multivariate time series and prints out the</span>
</pre>
    </td>
  </tr>
  <tr id="L172">
    <th class="line-num">
      <a href="#L172">172</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * eigenvalues, cointegrating factors, speeds of adjustment and Johansen test statistics.</span>
</pre>
    </td>
  </tr>
  <tr id="L173">
    <th class="line-num">
      <a href="#L173">173</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     *</span>
</pre>
    </td>
  </tr>
  <tr id="L174">
    <th class="line-num">
      <a href="#L174">174</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param timeSeries the multivariate time series for which to compute the cointegration</span>
</pre>
    </td>
  </tr>
  <tr id="L175">
    <th class="line-num">
      <a href="#L175">175</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L176">
    <th class="line-num">
      <a href="#L176">176</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="type">void</span> cointegration(MultivariateSimpleTimeSeries timeSeries) {
</pre>
    </td>
  </tr>
  <tr id="L177">
    <th class="line-num">
      <a href="#L177">177</a>
    </th>
    <td class="line-code">
      <pre>        CointegrationMLE coint = <span class="keyword">new</span> CointegrationMLE(timeSeries, <span class="predefined-constant">true</span>, <span class="integer">2</span>);
</pre>
    </td>
  </tr>
  <tr id="L178">
    <th class="line-num">
      <a href="#L178">178</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L179">
    <th class="line-num">
      <a href="#L179">179</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">Vector</span> eigenvalues = coint.getEigenvalues();
</pre>
    </td>
  </tr>
  <tr id="L180">
    <th class="line-num">
      <a href="#L180">180</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.println(<span class="string"><span class="delimiter">&quot;</span><span class="content">eigenvalues:</span><span class="delimiter">&quot;</span></span>);
</pre>
    </td>
  </tr>
  <tr id="L181">
    <th class="line-num">
      <a href="#L181">181</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.println(eigenvalues);
</pre>
    </td>
  </tr>
  <tr id="L182">
    <th class="line-num">
      <a href="#L182">182</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.println(<span class="string"><span class="delimiter">&quot;</span><span class="content">cointegrating factors</span><span class="delimiter">&quot;</span></span>);
</pre>
    </td>
  </tr>
  <tr id="L183">
    <th class="line-num">
      <a href="#L183">183</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.println(coint.beta());
</pre>
    </td>
  </tr>
  <tr id="L184">
    <th class="line-num">
      <a href="#L184">184</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.println(<span class="string"><span class="delimiter">&quot;</span><span class="content">speeds of adjustment</span><span class="delimiter">&quot;</span></span>);
</pre>
    </td>
  </tr>
  <tr id="L185">
    <th class="line-num">
      <a href="#L185">185</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.println(coint.alpha());
</pre>
    </td>
  </tr>
  <tr id="L186">
    <th class="line-num">
      <a href="#L186">186</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L187">
    <th class="line-num">
      <a href="#L187">187</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.println(<span class="string"><span class="delimiter">&quot;</span><span class="content">test statistics</span><span class="delimiter">&quot;</span></span>);
</pre>
    </td>
  </tr>
  <tr id="L188">
    <th class="line-num">
      <a href="#L188">188</a>
    </th>
    <td class="line-code">
      <pre>        JohansenTest test = <span class="keyword">new</span> JohansenTest(
</pre>
    </td>
  </tr>
  <tr id="L189">
    <th class="line-num">
      <a href="#L189">189</a>
    </th>
    <td class="line-code">
      <pre>                JohansenAsymptoticDistribution.Test.EIGEN,
</pre>
    </td>
  </tr>
  <tr id="L190">
    <th class="line-num">
      <a href="#L190">190</a>
    </th>
    <td class="line-code">
      <pre>                JohansenAsymptoticDistribution.TrendType.CONSTANT,
</pre>
    </td>
  </tr>
  <tr id="L191">
    <th class="line-num">
      <a href="#L191">191</a>
    </th>
    <td class="line-code">
      <pre>                eigenvalues.size());
</pre>
    </td>
  </tr>
  <tr id="L192">
    <th class="line-num">
      <a href="#L192">192</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.println(test.getStats(coint));
</pre>
    </td>
  </tr>
  <tr id="L193">
    <th class="line-num">
      <a href="#L193">193</a>
    </th>
    <td class="line-code">
      <pre>    }
</pre>
    </td>
  </tr>
  <tr id="L194">
    <th class="line-num">
      <a href="#L194">194</a>
    </th>
    <td class="line-code">
      <pre>}
</pre>
    </td>
  </tr>
</tbody>
</table>
</div>



        
        <div style="clear:both;"></div>
    </div>
</div>
</div>

<div id="ajax-indicator" style="display:none;"><span>Loading...</span></div>
<div id="ajax-modal" style="display:none;"></div>

<div id="footer">
  <div class="bgl"><div class="bgr">
    Powered by <a href="https://bitnami.com/stack/redmine">Bitnami Redmine Stack</a> &copy; 2006-2015 Jean-Philippe Lang
  </div></div>
</div>
</div>
</div>

</body>
</html>
