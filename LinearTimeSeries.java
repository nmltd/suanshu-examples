<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<title>/Examples/src/main/java/com/numericalmethod/suanshu/examples/LinearTimeSeries.java - Public - Redmine</title>
<meta name="description" content="Redmine" />
<meta name="keywords" content="issue,bug,tracker" />
<meta name="csrf-param" content="authenticity_token" />
<meta name="csrf-token" content="AOmd55pt6n5YJ+Z4l3ZBbavrwAAYUtq8sw6+aX9ndwVBXy7Fd4Bi/PB0bxLHKQj0viZSW9ewMlQ5jPqPM+V5pg==" />
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

<form id="revision_selector" action="/projects/public/repository/entry/Examples/src/main/java/com/numericalmethod/suanshu/examples/LinearTimeSeries.java" accept-charset="UTF-8" method="get"><input name="utf8" type="hidden" value="&#x2713;" />  <!-- Branches Dropdown -->


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
    / <a href="/projects/public/repository/changes/Examples/src/main/java/com/numericalmethod/suanshu/examples/LinearTimeSeries.java">LinearTimeSeries.java</a>


</h2>


<p>
<a href="/projects/public/repository/changes/Examples/src/main/java/com/numericalmethod/suanshu/examples/LinearTimeSeries.java">History</a> |
    View |
    <a href="/projects/public/repository/annotate/Examples/src/main/java/com/numericalmethod/suanshu/examples/LinearTimeSeries.java">Annotate</a> |
<a href="/projects/public/repository/raw/Examples/src/main/java/com/numericalmethod/suanshu/examples/LinearTimeSeries.java">Download</a>
(12.2 KB)
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
      <pre><span class="comment"> * </span>
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
      <pre><span class="comment"> * </span>
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
      <pre><span class="comment"> * </span>
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
      <pre><span class="comment"> * FITNESS FOR A PARTICULAR PURPOSE, MERCHANTABILITY, NON-INFRINGEMENT, </span>
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
      <pre><span class="comment"> * </span>
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
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.stats.random.rng.RNGUtils</span>;
</pre>
    </td>
  </tr>
  <tr id="L27">
    <th class="line-num">
      <a href="#L27">27</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.stats.timeseries.datastructure.univariate.realtime.inttime.IntTimeTimeSeries</span>;
</pre>
    </td>
  </tr>
  <tr id="L28">
    <th class="line-num">
      <a href="#L28">28</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.stats.timeseries.datastructure.univariate.realtime.inttime.SimpleTimeSeries</span>;
</pre>
    </td>
  </tr>
  <tr id="L29">
    <th class="line-num">
      <a href="#L29">29</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.stats.timeseries.linear.univariate.arima</span>.*;
</pre>
    </td>
  </tr>
  <tr id="L30">
    <th class="line-num">
      <a href="#L30">30</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.stats.timeseries.linear.univariate.stationaryprocess.arma</span>.*;
</pre>
    </td>
  </tr>
  <tr id="L31">
    <th class="line-num">
      <a href="#L31">31</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.stats.timeseries.linear.univariate.stationaryprocess.garch</span>.*;
</pre>
    </td>
  </tr>
  <tr id="L32">
    <th class="line-num">
      <a href="#L32">32</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">java.util.Arrays</span>;
</pre>
    </td>
  </tr>
  <tr id="L33">
    <th class="line-num">
      <a href="#L33">33</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">java.util.List</span>;
</pre>
    </td>
  </tr>
  <tr id="L34">
    <th class="line-num">
      <a href="#L34">34</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L35">
    <th class="line-num">
      <a href="#L35">35</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L36">
    <th class="line-num">
      <a href="#L36">36</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * Demonstrates how to construct and compute the properties for univariate linear time series in</span>
</pre>
    </td>
  </tr>
  <tr id="L37">
    <th class="line-num">
      <a href="#L37">37</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * Java using SuanShu.</span>
</pre>
    </td>
  </tr>
  <tr id="L38">
    <th class="line-num">
      <a href="#L38">38</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> *</span>
</pre>
    </td>
  </tr>
  <tr id="L39">
    <th class="line-num">
      <a href="#L39">39</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * @author Haksun Li</span>
</pre>
    </td>
  </tr>
  <tr id="L40">
    <th class="line-num">
      <a href="#L40">40</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> */</span>
</pre>
    </td>
  </tr>
  <tr id="L41">
    <th class="line-num">
      <a href="#L41">41</a>
    </th>
    <td class="line-code">
      <pre><span class="directive">public</span> <span class="directive">final</span> <span class="type">class</span> <span class="class">LinearTimeSeries</span> {
</pre>
    </td>
  </tr>
  <tr id="L42">
    <th class="line-num">
      <a href="#L42">42</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L43">
    <th class="line-num">
      <a href="#L43">43</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">private</span> LinearTimeSeries() {
</pre>
    </td>
  </tr>
  <tr id="L44">
    <th class="line-num">
      <a href="#L44">44</a>
    </th>
    <td class="line-code">
      <pre>    }
</pre>
    </td>
  </tr>
  <tr id="L45">
    <th class="line-num">
      <a href="#L45">45</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L46">
    <th class="line-num">
      <a href="#L46">46</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L47">
    <th class="line-num">
      <a href="#L47">47</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * Prints an ARIMA time series and generates data from a GARCH time series and prints a GARCH</span>
</pre>
    </td>
  </tr>
  <tr id="L48">
    <th class="line-num">
      <a href="#L48">48</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * model fitted to the generated series.</span>
</pre>
    </td>
  </tr>
  <tr id="L49">
    <th class="line-num">
      <a href="#L49">49</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     *</span>
</pre>
    </td>
  </tr>
  <tr id="L50">
    <th class="line-num">
      <a href="#L50">50</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param args not used</span>
</pre>
    </td>
  </tr>
  <tr id="L51">
    <th class="line-num">
      <a href="#L51">51</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L52">
    <th class="line-num">
      <a href="#L52">52</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="type">void</span> main(<span class="predefined-type">String</span><span class="type">[]</span> args) {
</pre>
    </td>
  </tr>
  <tr id="L53">
    <th class="line-num">
      <a href="#L53">53</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.println(<span class="string"><span class="delimiter">&quot;</span><span class="content">This class demonstrates how to construct and compute the properties for</span><span class="delimiter">&quot;</span></span>
</pre>
    </td>
  </tr>
  <tr id="L54">
    <th class="line-num">
      <a href="#L54">54</a>
    </th>
    <td class="line-code">
      <pre>            + <span class="string"><span class="delimiter">&quot;</span><span class="content"> univariate linear time series in Java using SuanShu.</span><span class="delimiter">&quot;</span></span>);
</pre>
    </td>
  </tr>
  <tr id="L55">
    <th class="line-num">
      <a href="#L55">55</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L56">
    <th class="line-num">
      <a href="#L56">56</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">Example ARIMA time series: %s%n</span><span class="delimiter">&quot;</span></span>,
</pre>
    </td>
  </tr>
  <tr id="L57">
    <th class="line-num">
      <a href="#L57">57</a>
    </th>
    <td class="line-code">
      <pre>                          <span class="predefined-type">Arrays</span>.toString(
</pre>
    </td>
  </tr>
  <tr id="L58">
    <th class="line-num">
      <a href="#L58">58</a>
    </th>
    <td class="line-code">
      <pre>                              generateARIMA(<span class="integer">10</span>, <span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="float">0.3</span>, -<span class="float">0.02</span>}, <span class="integer">1</span>, <span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="float">0.6</span>})));
</pre>
    </td>
  </tr>
  <tr id="L59">
    <th class="line-num">
      <a href="#L59">59</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L60">
    <th class="line-num">
      <a href="#L60">60</a>
    </th>
    <td class="line-code">
      <pre>        <span class="type">double</span><span class="type">[]</span> GARCHTimeSeries = generateGARCH(<span class="integer">10010</span>, <span class="float">0.2</span>, <span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="float">0.3</span>}, <span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="float">0.6</span>});
</pre>
    </td>
  </tr>
  <tr id="L61">
    <th class="line-num">
      <a href="#L61">61</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">Fitted GARCH model: %s%n</span><span class="delimiter">&quot;</span></span>, fitGARCH(GARCHTimeSeries, <span class="integer">1</span>, <span class="integer">1</span>));
</pre>
    </td>
  </tr>
  <tr id="L62">
    <th class="line-num">
      <a href="#L62">62</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L63">
    <th class="line-num">
      <a href="#L63">63</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.println(<span class="string"><span class="delimiter">&quot;</span><span class="content">Example ARMA time series one-step ahead forecast</span><span class="delimiter">&quot;</span></span>);
</pre>
    </td>
  </tr>
  <tr id="L64">
    <th class="line-num">
      <a href="#L64">64</a>
    </th>
    <td class="line-code">
      <pre>        armaForecastOneStep();
</pre>
    </td>
  </tr>
  <tr id="L65">
    <th class="line-num">
      <a href="#L65">65</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L66">
    <th class="line-num">
      <a href="#L66">66</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.println(<span class="string"><span class="delimiter">&quot;</span><span class="content">Example ARMA time series multi-step ahead forecast</span><span class="delimiter">&quot;</span></span>);
</pre>
    </td>
  </tr>
  <tr id="L67">
    <th class="line-num">
      <a href="#L67">67</a>
    </th>
    <td class="line-code">
      <pre>        armaForecastMultiStep();
</pre>
    </td>
  </tr>
  <tr id="L68">
    <th class="line-num">
      <a href="#L68">68</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L69">
    <th class="line-num">
      <a href="#L69">69</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.println(<span class="string"><span class="delimiter">&quot;</span><span class="content">Example ARMA time series forecast</span><span class="delimiter">&quot;</span></span>);
</pre>
    </td>
  </tr>
  <tr id="L70">
    <th class="line-num">
      <a href="#L70">70</a>
    </th>
    <td class="line-code">
      <pre>        armaForecast();
</pre>
    </td>
  </tr>
  <tr id="L71">
    <th class="line-num">
      <a href="#L71">71</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L72">
    <th class="line-num">
      <a href="#L72">72</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.println(<span class="string"><span class="delimiter">&quot;</span><span class="content">Example ARIMA time series one-step ahead forecast</span><span class="delimiter">&quot;</span></span>);
</pre>
    </td>
  </tr>
  <tr id="L73">
    <th class="line-num">
      <a href="#L73">73</a>
    </th>
    <td class="line-code">
      <pre>        arimaForecast_0010();
</pre>
    </td>
  </tr>
  <tr id="L74">
    <th class="line-num">
      <a href="#L74">74</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L75">
    <th class="line-num">
      <a href="#L75">75</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.println(<span class="string"><span class="delimiter">&quot;</span><span class="content">Example ARIMA time series multi-step ahead forecast</span><span class="delimiter">&quot;</span></span>);
</pre>
    </td>
  </tr>
  <tr id="L76">
    <th class="line-num">
      <a href="#L76">76</a>
    </th>
    <td class="line-code">
      <pre>        arimaForecast_0020();
</pre>
    </td>
  </tr>
  <tr id="L77">
    <th class="line-num">
      <a href="#L77">77</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L78">
    <th class="line-num">
      <a href="#L78">78</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.println(<span class="string"><span class="delimiter">&quot;</span><span class="content">Example ARIMA time series forecast</span><span class="delimiter">&quot;</span></span>);
</pre>
    </td>
  </tr>
  <tr id="L79">
    <th class="line-num">
      <a href="#L79">79</a>
    </th>
    <td class="line-code">
      <pre>        arimaForecast_0030();
</pre>
    </td>
  </tr>
  <tr id="L80">
    <th class="line-num">
      <a href="#L80">80</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L81">
    <th class="line-num">
      <a href="#L81">81</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.println(<span class="string"><span class="delimiter">&quot;</span><span class="content">Example fitting an ARMA and then GARCH on residuals</span><span class="delimiter">&quot;</span></span>);
</pre>
    </td>
  </tr>
  <tr id="L82">
    <th class="line-num">
      <a href="#L82">82</a>
    </th>
    <td class="line-code">
      <pre>        fit_arima_residual_garch();
</pre>
    </td>
  </tr>
  <tr id="L83">
    <th class="line-num">
      <a href="#L83">83</a>
    </th>
    <td class="line-code">
      <pre>    }
</pre>
    </td>
  </tr>
  <tr id="L84">
    <th class="line-num">
      <a href="#L84">84</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L85">
    <th class="line-num">
      <a href="#L85">85</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L86">
    <th class="line-num">
      <a href="#L86">86</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * Generate an ARIMA time series of the given length with the given parameters.</span>
</pre>
    </td>
  </tr>
  <tr id="L87">
    <th class="line-num">
      <a href="#L87">87</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     *</span>
</pre>
    </td>
  </tr>
  <tr id="L88">
    <th class="line-num">
      <a href="#L88">88</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param n  the length of the time series</span>
</pre>
    </td>
  </tr>
  <tr id="L89">
    <th class="line-num">
      <a href="#L89">89</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param AR the autoregressive component coefficients</span>
</pre>
    </td>
  </tr>
  <tr id="L90">
    <th class="line-num">
      <a href="#L90">90</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param d  the order of integration</span>
</pre>
    </td>
  </tr>
  <tr id="L91">
    <th class="line-num">
      <a href="#L91">91</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param MA the moving-average component coefficients</span>
</pre>
    </td>
  </tr>
  <tr id="L92">
    <th class="line-num">
      <a href="#L92">92</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @return the generated time series</span>
</pre>
    </td>
  </tr>
  <tr id="L93">
    <th class="line-num">
      <a href="#L93">93</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L94">
    <th class="line-num">
      <a href="#L94">94</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="type">double</span><span class="type">[]</span> generateARIMA(<span class="type">int</span> n, <span class="type">double</span><span class="type">[]</span> AR, <span class="type">int</span> d, <span class="type">double</span><span class="type">[]</span> MA) {
</pre>
    </td>
  </tr>
  <tr id="L95">
    <th class="line-num">
      <a href="#L95">95</a>
    </th>
    <td class="line-code">
      <pre>        ARIMASim sim = <span class="keyword">new</span> ARIMASim(<span class="keyword">new</span> ARIMAModel(AR, d, MA));
</pre>
    </td>
  </tr>
  <tr id="L96">
    <th class="line-num">
      <a href="#L96">96</a>
    </th>
    <td class="line-code">
      <pre>        <span class="keyword">return</span> RNGUtils.nextN(sim, n);
</pre>
    </td>
  </tr>
  <tr id="L97">
    <th class="line-num">
      <a href="#L97">97</a>
    </th>
    <td class="line-code">
      <pre>    }
</pre>
    </td>
  </tr>
  <tr id="L98">
    <th class="line-num">
      <a href="#L98">98</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L99">
    <th class="line-num">
      <a href="#L99">99</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L100">
    <th class="line-num">
      <a href="#L100">100</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * Generate a GARCH time series of the given length with the given parameters.</span>
</pre>
    </td>
  </tr>
  <tr id="L101">
    <th class="line-num">
      <a href="#L101">101</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     *</span>
</pre>
    </td>
  </tr>
  <tr id="L102">
    <th class="line-num">
      <a href="#L102">102</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param n  the length of the time series that is to be generated</span>
</pre>
    </td>
  </tr>
  <tr id="L103">
    <th class="line-num">
      <a href="#L103">103</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param a0 the constant term</span>
</pre>
    </td>
  </tr>
  <tr id="L104">
    <th class="line-num">
      <a href="#L104">104</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param a  the ARCH coefficients</span>
</pre>
    </td>
  </tr>
  <tr id="L105">
    <th class="line-num">
      <a href="#L105">105</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param b  the GARCH coefficients</span>
</pre>
    </td>
  </tr>
  <tr id="L106">
    <th class="line-num">
      <a href="#L106">106</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     *</span>
</pre>
    </td>
  </tr>
  <tr id="L107">
    <th class="line-num">
      <a href="#L107">107</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @return the generated time series.</span>
</pre>
    </td>
  </tr>
  <tr id="L108">
    <th class="line-num">
      <a href="#L108">108</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L109">
    <th class="line-num">
      <a href="#L109">109</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="type">double</span><span class="type">[]</span> generateGARCH(<span class="type">int</span> n, <span class="type">double</span> a0, <span class="type">double</span><span class="type">[]</span> a, <span class="type">double</span><span class="type">[]</span> b) {
</pre>
    </td>
  </tr>
  <tr id="L110">
    <th class="line-num">
      <a href="#L110">110</a>
    </th>
    <td class="line-code">
      <pre>        GARCHSim sim = <span class="keyword">new</span> GARCHSim(<span class="keyword">new</span> GARCHModel(a0, a, b));
</pre>
    </td>
  </tr>
  <tr id="L111">
    <th class="line-num">
      <a href="#L111">111</a>
    </th>
    <td class="line-code">
      <pre>        <span class="keyword">return</span> RNGUtils.nextN(sim, n);
</pre>
    </td>
  </tr>
  <tr id="L112">
    <th class="line-num">
      <a href="#L112">112</a>
    </th>
    <td class="line-code">
      <pre>    }
</pre>
    </td>
  </tr>
  <tr id="L113">
    <th class="line-num">
      <a href="#L113">113</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L114">
    <th class="line-num">
      <a href="#L114">114</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L115">
    <th class="line-num">
      <a href="#L115">115</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * Fits a GARCH model with the given order to the given time series.</span>
</pre>
    </td>
  </tr>
  <tr id="L116">
    <th class="line-num">
      <a href="#L116">116</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     *</span>
</pre>
    </td>
  </tr>
  <tr id="L117">
    <th class="line-num">
      <a href="#L117">117</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param timeSeries the time series to fit a GARCH model to</span>
</pre>
    </td>
  </tr>
  <tr id="L118">
    <th class="line-num">
      <a href="#L118">118</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param p          the order of the ARCH coefficients</span>
</pre>
    </td>
  </tr>
  <tr id="L119">
    <th class="line-num">
      <a href="#L119">119</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param q          the order of the GARCH coefficients</span>
</pre>
    </td>
  </tr>
  <tr id="L120">
    <th class="line-num">
      <a href="#L120">120</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @return the fitted model</span>
</pre>
    </td>
  </tr>
  <tr id="L121">
    <th class="line-num">
      <a href="#L121">121</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L122">
    <th class="line-num">
      <a href="#L122">122</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> GARCHModel fitGARCH(<span class="type">double</span><span class="type">[]</span> timeSeries, <span class="type">int</span> p, <span class="type">int</span> q) {
</pre>
    </td>
  </tr>
  <tr id="L123">
    <th class="line-num">
      <a href="#L123">123</a>
    </th>
    <td class="line-code">
      <pre>        GARCHFit instance = <span class="keyword">new</span> GARCHFit(timeSeries, p, q);
</pre>
    </td>
  </tr>
  <tr id="L124">
    <th class="line-num">
      <a href="#L124">124</a>
    </th>
    <td class="line-code">
      <pre>        <span class="keyword">return</span> instance.getModel();
</pre>
    </td>
  </tr>
  <tr id="L125">
    <th class="line-num">
      <a href="#L125">125</a>
    </th>
    <td class="line-code">
      <pre>    }
</pre>
    </td>
  </tr>
  <tr id="L126">
    <th class="line-num">
      <a href="#L126">126</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L127">
    <th class="line-num">
      <a href="#L127">127</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L128">
    <th class="line-num">
      <a href="#L128">128</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * example 5.3.4, time series - theory and methods, 2nd, Brockwell &amp; Davis</span>
</pre>
    </td>
  </tr>
  <tr id="L129">
    <th class="line-num">
      <a href="#L129">129</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L130">
    <th class="line-num">
      <a href="#L130">130</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="type">void</span> armaForecastOneStep() {
</pre>
    </td>
  </tr>
  <tr id="L131">
    <th class="line-num">
      <a href="#L131">131</a>
    </th>
    <td class="line-code">
      <pre>        ARMAModel arma = <span class="keyword">new</span> ARMAModel(
</pre>
    </td>
  </tr>
  <tr id="L132">
    <th class="line-num">
      <a href="#L132">132</a>
    </th>
    <td class="line-code">
      <pre>            <span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="float">1.0</span>, -<span class="float">0.24</span>},
</pre>
    </td>
  </tr>
  <tr id="L133">
    <th class="line-num">
      <a href="#L133">133</a>
    </th>
    <td class="line-code">
      <pre>            <span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="float">0.4</span>, <span class="float">0.2</span>, <span class="float">0.1</span>});
</pre>
    </td>
  </tr>
  <tr id="L134">
    <th class="line-num">
      <a href="#L134">134</a>
    </th>
    <td class="line-code">
      <pre>        IntTimeTimeSeries xt = <span class="keyword">new</span> SimpleTimeSeries(<span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="float">1.704</span>, <span class="float">0.527</span>, <span class="float">1.041</span>, <span class="float">0.942</span>, <span class="float">0.555</span>, -<span class="float">1.002</span>, -<span class="float">0.585</span>, <span class="float">0.010</span>, -<span class="float">0.638</span>, <span class="float">0.525</span>});
</pre>
    </td>
  </tr>
  <tr id="L135">
    <th class="line-num">
      <a href="#L135">135</a>
    </th>
    <td class="line-code">
      <pre>        ARMAForecastOneStep instance = <span class="keyword">new</span> ARMAForecastOneStep(xt, arma);
</pre>
    </td>
  </tr>
  <tr id="L136">
    <th class="line-num">
      <a href="#L136">136</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L137">
    <th class="line-num">
      <a href="#L137">137</a>
    </th>
    <td class="line-code">
      <pre>        <span class="keyword">for</span> (<span class="type">int</span> i = <span class="integer">0</span>; i &lt;= <span class="integer">10</span>; ++i) {
</pre>
    </td>
  </tr>
  <tr id="L138">
    <th class="line-num">
      <a href="#L138">138</a>
    </th>
    <td class="line-code">
      <pre>            <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">x^: %f (%f)%n</span><span class="delimiter">&quot;</span></span>, instance.xHat(i), instance.var(i));
</pre>
    </td>
  </tr>
  <tr id="L139">
    <th class="line-num">
      <a href="#L139">139</a>
    </th>
    <td class="line-code">
      <pre>        }
</pre>
    </td>
  </tr>
  <tr id="L140">
    <th class="line-num">
      <a href="#L140">140</a>
    </th>
    <td class="line-code">
      <pre>    }
</pre>
    </td>
  </tr>
  <tr id="L141">
    <th class="line-num">
      <a href="#L141">141</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L142">
    <th class="line-num">
      <a href="#L142">142</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L143">
    <th class="line-num">
      <a href="#L143">143</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * example 5.3.5, time series - theory and methods, 2nd, Brockwell &amp; Davis</span>
</pre>
    </td>
  </tr>
  <tr id="L144">
    <th class="line-num">
      <a href="#L144">144</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L145">
    <th class="line-num">
      <a href="#L145">145</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="type">void</span> armaForecastMultiStep() {
</pre>
    </td>
  </tr>
  <tr id="L146">
    <th class="line-num">
      <a href="#L146">146</a>
    </th>
    <td class="line-code">
      <pre>        ARMAModel arma = <span class="keyword">new</span> ARMAModel(
</pre>
    </td>
  </tr>
  <tr id="L147">
    <th class="line-num">
      <a href="#L147">147</a>
    </th>
    <td class="line-code">
      <pre>            <span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="float">1.0</span>, -<span class="float">0.24</span>},
</pre>
    </td>
  </tr>
  <tr id="L148">
    <th class="line-num">
      <a href="#L148">148</a>
    </th>
    <td class="line-code">
      <pre>            <span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="float">0.4</span>, <span class="float">0.2</span>, <span class="float">0.1</span>});
</pre>
    </td>
  </tr>
  <tr id="L149">
    <th class="line-num">
      <a href="#L149">149</a>
    </th>
    <td class="line-code">
      <pre>        IntTimeTimeSeries xt = <span class="keyword">new</span> SimpleTimeSeries(<span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="float">1.704</span>, <span class="float">0.527</span>, <span class="float">1.041</span>, <span class="float">0.942</span>, <span class="float">0.555</span>, -<span class="float">1.002</span>, -<span class="float">0.585</span>, <span class="float">0.010</span>, -<span class="float">0.638</span>, <span class="float">0.525</span>});
</pre>
    </td>
  </tr>
  <tr id="L150">
    <th class="line-num">
      <a href="#L150">150</a>
    </th>
    <td class="line-code">
      <pre>        ARMAForecastMultiStep instance = <span class="keyword">new</span> ARMAForecastMultiStep(xt, arma, <span class="integer">3</span>);
</pre>
    </td>
  </tr>
  <tr id="L151">
    <th class="line-num">
      <a href="#L151">151</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">Vector</span> xHat = instance.allForecasts();
</pre>
    </td>
  </tr>
  <tr id="L152">
    <th class="line-num">
      <a href="#L152">152</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">Vector</span> var = instance.allMSEs();
</pre>
    </td>
  </tr>
  <tr id="L153">
    <th class="line-num">
      <a href="#L153">153</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L154">
    <th class="line-num">
      <a href="#L154">154</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">x^= %f (%f)%n</span><span class="delimiter">&quot;</span></span>, xHat.get(<span class="integer">1</span>), var.get(<span class="integer">1</span>));
</pre>
    </td>
  </tr>
  <tr id="L155">
    <th class="line-num">
      <a href="#L155">155</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">x^= %f (%f)%n</span><span class="delimiter">&quot;</span></span>, xHat.get(<span class="integer">2</span>), var.get(<span class="integer">2</span>));
</pre>
    </td>
  </tr>
  <tr id="L156">
    <th class="line-num">
      <a href="#L156">156</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">x^= %f (%f)%n</span><span class="delimiter">&quot;</span></span>, xHat.get(<span class="integer">3</span>), var.get(<span class="integer">3</span>));
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
      <pre><span class="comment">     * example 5.3.4, time series - theory and methods, 2nd, Brockwell &amp; Davis</span>
</pre>
    </td>
  </tr>
  <tr id="L161">
    <th class="line-num">
      <a href="#L161">161</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L162">
    <th class="line-num">
      <a href="#L162">162</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="type">void</span> armaForecast() {
</pre>
    </td>
  </tr>
  <tr id="L163">
    <th class="line-num">
      <a href="#L163">163</a>
    </th>
    <td class="line-code">
      <pre>        ARMAModel arma = <span class="keyword">new</span> ARMAModel(
</pre>
    </td>
  </tr>
  <tr id="L164">
    <th class="line-num">
      <a href="#L164">164</a>
    </th>
    <td class="line-code">
      <pre>            <span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="float">1.0</span>, -<span class="float">0.24</span>},
</pre>
    </td>
  </tr>
  <tr id="L165">
    <th class="line-num">
      <a href="#L165">165</a>
    </th>
    <td class="line-code">
      <pre>            <span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="float">0.4</span>, <span class="float">0.2</span>, <span class="float">0.1</span>});
</pre>
    </td>
  </tr>
  <tr id="L166">
    <th class="line-num">
      <a href="#L166">166</a>
    </th>
    <td class="line-code">
      <pre>        IntTimeTimeSeries xt = <span class="keyword">new</span> SimpleTimeSeries(<span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="float">1.704</span>, <span class="float">0.527</span>, <span class="float">1.041</span>, <span class="float">0.942</span>, <span class="float">0.555</span>, -<span class="float">1.002</span>, -<span class="float">0.585</span>, <span class="float">0.010</span>, -<span class="float">0.638</span>, <span class="float">0.525</span>});
</pre>
    </td>
  </tr>
  <tr id="L167">
    <th class="line-num">
      <a href="#L167">167</a>
    </th>
    <td class="line-code">
      <pre>        ARMAForecast instance = <span class="keyword">new</span> ARMAForecast(xt, arma);
</pre>
    </td>
  </tr>
  <tr id="L168">
    <th class="line-num">
      <a href="#L168">168</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L169">
    <th class="line-num">
      <a href="#L169">169</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">List</span>&lt;ARIMAForecast.Forecast&gt; forecasts = instance.next(<span class="integer">10</span>);
</pre>
    </td>
  </tr>
  <tr id="L170">
    <th class="line-num">
      <a href="#L170">170</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">forecasts = %s%n</span><span class="delimiter">&quot;</span></span>, forecasts);
</pre>
    </td>
  </tr>
  <tr id="L171">
    <th class="line-num">
      <a href="#L171">171</a>
    </th>
    <td class="line-code">
      <pre>    }
</pre>
    </td>
  </tr>
  <tr id="L172">
    <th class="line-num">
      <a href="#L172">172</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L173">
    <th class="line-num">
      <a href="#L173">173</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * example 9.5.1, time series - theory and methods, 2nd, Brockwell &amp; Davis</span>
</pre>
    </td>
  </tr>
  <tr id="L174">
    <th class="line-num">
      <a href="#L174">174</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L175">
    <th class="line-num">
      <a href="#L175">175</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="type">double</span><span class="type">[]</span> x = <span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{
</pre>
    </td>
  </tr>
  <tr id="L176">
    <th class="line-num">
      <a href="#L176">176</a>
    </th>
    <td class="line-code">
      <pre>        -<span class="float">2.533221</span>, -<span class="float">9.075923</span>, -<span class="float">19.16261</span>, -<span class="float">33.12857</span>, -<span class="float">52.81117</span>, -<span class="float">76.74696</span>, -<span class="float">103.2003</span>, -<span class="float">132.419</span>, -<span class="float">165.8976</span>, -<span class="float">204.0274</span>,
</pre>
    </td>
  </tr>
  <tr id="L177">
    <th class="line-num">
      <a href="#L177">177</a>
    </th>
    <td class="line-code">
      <pre>        -<span class="float">246.0101</span>, -<span class="float">291.2664</span>, -<span class="float">339.8645</span>, -<span class="float">391.4285</span>, -<span class="float">446.3886</span>, -<span class="float">504.7951</span>, -<span class="float">566.7244</span>, -<span class="float">631.5703</span>, -<span class="float">698.1581</span>, -<span class="float">766.6702</span>,
</pre>
    </td>
  </tr>
  <tr id="L178">
    <th class="line-num">
      <a href="#L178">178</a>
    </th>
    <td class="line-code">
      <pre>        -<span class="float">836.0842</span>, -<span class="float">905.3469</span>, -<span class="float">975.1016</span>, -<span class="float">1044.21</span>, -<span class="float">1111.252</span>, -<span class="float">1177.355</span>, -<span class="float">1242.904</span>, -<span class="float">1307.318</span>, -<span class="float">1371.756</span>, -<span class="float">1436.51</span>,
</pre>
    </td>
  </tr>
  <tr id="L179">
    <th class="line-num">
      <a href="#L179">179</a>
    </th>
    <td class="line-code">
      <pre>        -<span class="float">1499.991</span>, -<span class="float">1561.489</span>, -<span class="float">1620.846</span>, -<span class="float">1679.025</span>, -<span class="float">1736.917</span>, -<span class="float">1794.468</span>, -<span class="float">1851.077</span>, -<span class="float">1906.859</span>, -<span class="float">1960.592</span>, -<span class="float">2009.976</span>,
</pre>
    </td>
  </tr>
  <tr id="L180">
    <th class="line-num">
      <a href="#L180">180</a>
    </th>
    <td class="line-code">
      <pre>        -<span class="float">2055.399</span>, -<span class="float">2097.481</span>, -<span class="float">2136.418</span>, -<span class="float">2173.31</span>, -<span class="float">2210.799</span>, -<span class="float">2250.452</span>, -<span class="float">2290.607</span>, -<span class="float">2328.468</span>, -<span class="float">2363.411</span>, -<span class="float">2398.694</span>,
</pre>
    </td>
  </tr>
  <tr id="L181">
    <th class="line-num">
      <a href="#L181">181</a>
    </th>
    <td class="line-code">
      <pre>        -<span class="float">2437.595</span>, -<span class="float">2481.963</span>, -<span class="float">2532.981</span>, -<span class="float">2589.522</span>, -<span class="float">2651.942</span>, -<span class="float">2721.417</span>, -<span class="float">2797.623</span>, -<span class="float">2880.387</span>, -<span class="float">2968.625</span>, -<span class="float">3060.799</span>,
</pre>
    </td>
  </tr>
  <tr id="L182">
    <th class="line-num">
      <a href="#L182">182</a>
    </th>
    <td class="line-code">
      <pre>        -<span class="float">3156.102</span>, -<span class="float">3253.448</span>, -<span class="float">3353.284</span>, -<span class="float">3456.878</span>, -<span class="float">3564.321</span>, -<span class="float">3674.987</span>, -<span class="float">3788.705</span>, -<span class="float">3906.614</span>, -<span class="float">4028.158</span>, -<span class="float">4152.984</span>,
</pre>
    </td>
  </tr>
  <tr id="L183">
    <th class="line-num">
      <a href="#L183">183</a>
    </th>
    <td class="line-code">
      <pre>        -<span class="float">4281.718</span>, -<span class="float">4412.014</span>, -<span class="float">4542.326</span>, -<span class="float">4673.323</span>, -<span class="float">4805.021</span>, -<span class="float">4937.22</span>, -<span class="float">5068.708</span>, -<span class="float">5197.765</span>, -<span class="float">5323.609</span>, -<span class="float">5444.392</span>,
</pre>
    </td>
  </tr>
  <tr id="L184">
    <th class="line-num">
      <a href="#L184">184</a>
    </th>
    <td class="line-code">
      <pre>        -<span class="float">5557.963</span>, -<span class="float">5663.825</span>, -<span class="float">5760.606</span>, -<span class="float">5848.78</span>, -<span class="float">5931.625</span>, -<span class="float">6011.752</span>, -<span class="float">6090.37</span>, -<span class="float">6167.945</span>, -<span class="float">6244.318</span>, -<span class="float">6317.813</span>,
</pre>
    </td>
  </tr>
  <tr id="L185">
    <th class="line-num">
      <a href="#L185">185</a>
    </th>
    <td class="line-code">
      <pre>        -<span class="float">6387.302</span>, -<span class="float">6453.514</span>, -<span class="float">6518.92</span>, -<span class="float">6584.648</span>, -<span class="float">6649.018</span>, -<span class="float">6711.818</span>, -<span class="float">6773.328</span>, -<span class="float">6834.459</span>, -<span class="float">6896.037</span>, -<span class="float">6957.059</span>,
</pre>
    </td>
  </tr>
  <tr id="L186">
    <th class="line-num">
      <a href="#L186">186</a>
    </th>
    <td class="line-code">
      <pre>        -<span class="float">7015.645</span>, -<span class="float">7073.066</span>, -<span class="float">7131.673</span>, -<span class="float">7193.304</span>, -<span class="float">7259.945</span>, -<span class="float">7332.856</span>, -<span class="float">7411.194</span>, -<span class="float">7495.30</span>, -<span class="float">7586.351</span>, -<span class="float">7683.235</span>,
</pre>
    </td>
  </tr>
  <tr id="L187">
    <th class="line-num">
      <a href="#L187">187</a>
    </th>
    <td class="line-code">
      <pre>        -<span class="float">7784.692</span>, -<span class="float">7891.431</span>, -<span class="float">8004.574</span>, -<span class="float">8123.962</span>, -<span class="float">8249.225</span>, -<span class="float">8379.052</span>, -<span class="float">8512.296</span>, -<span class="float">8649.823</span>, -<span class="float">8791.181000000001</span>, -<span class="float">8936.366</span>,
</pre>
    </td>
  </tr>
  <tr id="L188">
    <th class="line-num">
      <a href="#L188">188</a>
    </th>
    <td class="line-code">
      <pre>        -<span class="float">9086.25</span>, -<span class="float">9239.602999999999</span>, -<span class="float">9394.603999999999</span>, -<span class="float">9552.022999999999</span>, -<span class="float">9713.290000000001</span>, -<span class="float">9878.415000000001</span>, -<span class="float">10047.16</span>, -<span class="float">10219.03</span>, -<span class="float">10392.09</span>, -<span class="float">10564.01</span>,
</pre>
    </td>
  </tr>
  <tr id="L189">
    <th class="line-num">
      <a href="#L189">189</a>
    </th>
    <td class="line-code">
      <pre>        -<span class="float">10733.97</span>, -<span class="float">10903.16</span>, -<span class="float">11071.92</span>, -<span class="float">11238.94</span>, -<span class="float">11401.98</span>, -<span class="float">11560.23</span>, -<span class="float">11713.78</span>, -<span class="float">11863.90</span>, -<span class="float">12011.69</span>, -<span class="float">12157.49</span>,
</pre>
    </td>
  </tr>
  <tr id="L190">
    <th class="line-num">
      <a href="#L190">190</a>
    </th>
    <td class="line-code">
      <pre>        -<span class="float">12302.53</span>, -<span class="float">12447.54</span>, -<span class="float">12593.37</span>, -<span class="float">12740.76</span>, -<span class="float">12889.65</span>, -<span class="float">13039.82</span>, -<span class="float">13190.25</span>, -<span class="float">13339.56</span>, -<span class="float">13486.25</span>, -<span class="float">13629.28</span>,
</pre>
    </td>
  </tr>
  <tr id="L191">
    <th class="line-num">
      <a href="#L191">191</a>
    </th>
    <td class="line-code">
      <pre>        -<span class="float">13769.90</span>, -<span class="float">13910.10</span>, -<span class="float">14051.69</span>, -<span class="float">14196.29</span>, -<span class="float">14345.89</span>, -<span class="float">14499.74</span>, -<span class="float">14657.51</span>, -<span class="float">14819.80</span>, -<span class="float">14986.36</span>, -<span class="float">15158.30</span>,
</pre>
    </td>
  </tr>
  <tr id="L192">
    <th class="line-num">
      <a href="#L192">192</a>
    </th>
    <td class="line-code">
      <pre>        -<span class="float">15335.89</span>, -<span class="float">15518.39</span>, -<span class="float">15704.95</span>, -<span class="float">15895.81</span>, -<span class="float">16091.51</span>, -<span class="float">16290.87</span>, -<span class="float">16492.67</span>, -<span class="float">16697.11</span>, -<span class="float">16904.22</span>, -<span class="float">17113.52</span>,
</pre>
    </td>
  </tr>
  <tr id="L193">
    <th class="line-num">
      <a href="#L193">193</a>
    </th>
    <td class="line-code">
      <pre>        -<span class="float">17324.42</span>, -<span class="float">17535.69</span>, -<span class="float">17745.23</span>, -<span class="float">17951.45</span>, -<span class="float">18155.61</span>, -<span class="float">18360.14</span>, -<span class="float">18564.21</span>, -<span class="float">18766.18</span>, -<span class="float">18965.08</span>, -<span class="float">19161.70</span>,
</pre>
    </td>
  </tr>
  <tr id="L194">
    <th class="line-num">
      <a href="#L194">194</a>
    </th>
    <td class="line-code">
      <pre>        -<span class="float">19356.27</span>, -<span class="float">19546.96</span>, -<span class="float">19733.54</span>, -<span class="float">19919.49</span>, -<span class="float">20107.26</span>, -<span class="float">20294.51</span>, -<span class="float">20478.04</span>, -<span class="float">20655.74</span>, -<span class="float">20827.69</span>, -<span class="float">20993.73</span>,
</pre>
    </td>
  </tr>
  <tr id="L195">
    <th class="line-num">
      <a href="#L195">195</a>
    </th>
    <td class="line-code">
      <pre>        -<span class="float">21154.39</span>, -<span class="float">21310.90</span>, -<span class="float">21463.65</span>, -<span class="float">21613.98</span>, -<span class="float">21762.12</span>, -<span class="float">21908.27</span>, -<span class="float">22053.19</span>, -<span class="float">22195.57</span>, -<span class="float">22335.07</span>, -<span class="float">22474.41</span>
</pre>
    </td>
  </tr>
  <tr id="L196">
    <th class="line-num">
      <a href="#L196">196</a>
    </th>
    <td class="line-code">
      <pre>    };
</pre>
    </td>
  </tr>
  <tr id="L197">
    <th class="line-num">
      <a href="#L197">197</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L198">
    <th class="line-num">
      <a href="#L198">198</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L199">
    <th class="line-num">
      <a href="#L199">199</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * example 9.5.1, time series - theory and methods, 2nd, Brockwell &amp; Davis</span>
</pre>
    </td>
  </tr>
  <tr id="L200">
    <th class="line-num">
      <a href="#L200">200</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L201">
    <th class="line-num">
      <a href="#L201">201</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="type">void</span> arimaForecast_0010() {
</pre>
    </td>
  </tr>
  <tr id="L202">
    <th class="line-num">
      <a href="#L202">202</a>
    </th>
    <td class="line-code">
      <pre>        ARIMAModel arima = <span class="keyword">new</span> ARIMAModel(<span class="integer">0</span>, <span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="float">0.9</span>}, <span class="integer">2</span>, <span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="float">0.8</span>});
</pre>
    </td>
  </tr>
  <tr id="L203">
    <th class="line-num">
      <a href="#L203">203</a>
    </th>
    <td class="line-code">
      <pre>        ARIMAForecastMultiStep instance = <span class="keyword">new</span> ARIMAForecastMultiStep(<span class="keyword">new</span> SimpleTimeSeries(x), arima, <span class="integer">1</span>);
</pre>
    </td>
  </tr>
  <tr id="L204">
    <th class="line-num">
      <a href="#L204">204</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L205">
    <th class="line-num">
      <a href="#L205">205</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">the differenced series y[1] = %f%n</span><span class="delimiter">&quot;</span></span>, instance.y(<span class="integer">1</span>));
</pre>
    </td>
  </tr>
  <tr id="L206">
    <th class="line-num">
      <a href="#L206">206</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">the differenced series y[1] = %f%n</span><span class="delimiter">&quot;</span></span>, instance.y(<span class="integer">2</span>));
</pre>
    </td>
  </tr>
  <tr id="L207">
    <th class="line-num">
      <a href="#L207">207</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">the differenced series y[1] = %f%n</span><span class="delimiter">&quot;</span></span>, instance.y(<span class="integer">198</span>));
</pre>
    </td>
  </tr>
  <tr id="L208">
    <th class="line-num">
      <a href="#L208">208</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L209">
    <th class="line-num">
      <a href="#L209">209</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">x^ = %f (%f)%n</span><span class="delimiter">&quot;</span></span>, instance.xHat(), instance.var());
</pre>
    </td>
  </tr>
  <tr id="L210">
    <th class="line-num">
      <a href="#L210">210</a>
    </th>
    <td class="line-code">
      <pre>    }
</pre>
    </td>
  </tr>
  <tr id="L211">
    <th class="line-num">
      <a href="#L211">211</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L212">
    <th class="line-num">
      <a href="#L212">212</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L213">
    <th class="line-num">
      <a href="#L213">213</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * example 9.5.1, time series - theory and methods, 2nd, Brockwell &amp; Davis</span>
</pre>
    </td>
  </tr>
  <tr id="L214">
    <th class="line-num">
      <a href="#L214">214</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L215">
    <th class="line-num">
      <a href="#L215">215</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="type">void</span> arimaForecast_0020() {
</pre>
    </td>
  </tr>
  <tr id="L216">
    <th class="line-num">
      <a href="#L216">216</a>
    </th>
    <td class="line-code">
      <pre>        ARIMAModel arima = <span class="keyword">new</span> ARIMAModel(<span class="integer">0</span>, <span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="float">0.9</span>}, <span class="integer">2</span>, <span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="float">0.8</span>});
</pre>
    </td>
  </tr>
  <tr id="L217">
    <th class="line-num">
      <a href="#L217">217</a>
    </th>
    <td class="line-code">
      <pre>        ARIMAForecastMultiStep instance = <span class="keyword">new</span> ARIMAForecastMultiStep(<span class="keyword">new</span> SimpleTimeSeries(x), arima, <span class="integer">2</span>);
</pre>
    </td>
  </tr>
  <tr id="L218">
    <th class="line-num">
      <a href="#L218">218</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L219">
    <th class="line-num">
      <a href="#L219">219</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">x^ = %f (%f)%n</span><span class="delimiter">&quot;</span></span>, instance.xHat(), instance.var());
</pre>
    </td>
  </tr>
  <tr id="L220">
    <th class="line-num">
      <a href="#L220">220</a>
    </th>
    <td class="line-code">
      <pre>    }
</pre>
    </td>
  </tr>
  <tr id="L221">
    <th class="line-num">
      <a href="#L221">221</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L222">
    <th class="line-num">
      <a href="#L222">222</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L223">
    <th class="line-num">
      <a href="#L223">223</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * example 9.5.1, time series - theory and methods, 2nd, Brockwell &amp; Davis</span>
</pre>
    </td>
  </tr>
  <tr id="L224">
    <th class="line-num">
      <a href="#L224">224</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L225">
    <th class="line-num">
      <a href="#L225">225</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="type">void</span> arimaForecast_0030() {
</pre>
    </td>
  </tr>
  <tr id="L226">
    <th class="line-num">
      <a href="#L226">226</a>
    </th>
    <td class="line-code">
      <pre>        ARIMAModel arima = <span class="keyword">new</span> ARIMAModel(<span class="integer">0</span>, <span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="float">0.9</span>}, <span class="integer">2</span>, <span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="float">0.8</span>});
</pre>
    </td>
  </tr>
  <tr id="L227">
    <th class="line-num">
      <a href="#L227">227</a>
    </th>
    <td class="line-code">
      <pre>        ARIMAForecast instance = <span class="keyword">new</span> ARIMAForecast(
</pre>
    </td>
  </tr>
  <tr id="L228">
    <th class="line-num">
      <a href="#L228">228</a>
    </th>
    <td class="line-code">
      <pre>            <span class="keyword">new</span> SimpleTimeSeries(x),
</pre>
    </td>
  </tr>
  <tr id="L229">
    <th class="line-num">
      <a href="#L229">229</a>
    </th>
    <td class="line-code">
      <pre>            arima);
</pre>
    </td>
  </tr>
  <tr id="L230">
    <th class="line-num">
      <a href="#L230">230</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L231">
    <th class="line-num">
      <a href="#L231">231</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">List</span>&lt;ARIMAForecast.Forecast&gt; forecasts = instance.next(<span class="integer">5</span>);
</pre>
    </td>
  </tr>
  <tr id="L232">
    <th class="line-num">
      <a href="#L232">232</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">forecasts = %s%n</span><span class="delimiter">&quot;</span></span>, forecasts);
</pre>
    </td>
  </tr>
  <tr id="L233">
    <th class="line-num">
      <a href="#L233">233</a>
    </th>
    <td class="line-code">
      <pre>    }
</pre>
    </td>
  </tr>
  <tr id="L234">
    <th class="line-num">
      <a href="#L234">234</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L235">
    <th class="line-num">
      <a href="#L235">235</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L236">
    <th class="line-num">
      <a href="#L236">236</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * This example first fit a time series to an ARMA(1, 1) model. It then computes the residual</span>
</pre>
    </td>
  </tr>
  <tr id="L237">
    <th class="line-num">
      <a href="#L237">237</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * time series.</span>
</pre>
    </td>
  </tr>
  <tr id="L238">
    <th class="line-num">
      <a href="#L238">238</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * Finally, it fits the residuals to a GARCH(1, 1) model.</span>
</pre>
    </td>
  </tr>
  <tr id="L239">
    <th class="line-num">
      <a href="#L239">239</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L240">
    <th class="line-num">
      <a href="#L240">240</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="type">void</span> fit_arima_residual_garch() {
</pre>
    </td>
  </tr>
  <tr id="L241">
    <th class="line-num">
      <a href="#L241">241</a>
    </th>
    <td class="line-code">
      <pre>        <span class="comment">// the time series</span>
</pre>
    </td>
  </tr>
  <tr id="L242">
    <th class="line-num">
      <a href="#L242">242</a>
    </th>
    <td class="line-code">
      <pre>        IntTimeTimeSeries x = <span class="keyword">new</span> SimpleTimeSeries(<span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{-<span class="float">1.1</span>, <span class="float">0.514</span>, <span class="float">0.116</span>, -<span class="float">0.845</span>, <span class="float">0.872</span>, -<span class="float">0.467</span>, -<span class="float">0.977</span>, -<span class="float">1.699</span>, -<span class="float">1.228</span>, -<span class="float">1.093</span>});
</pre>
    </td>
  </tr>
  <tr id="L243">
    <th class="line-num">
      <a href="#L243">243</a>
    </th>
    <td class="line-code">
      <pre>        <span class="type">double</span><span class="type">[]</span> xt = x.toArray();
</pre>
    </td>
  </tr>
  <tr id="L244">
    <th class="line-num">
      <a href="#L244">244</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L245">
    <th class="line-num">
      <a href="#L245">245</a>
    </th>
    <td class="line-code">
      <pre>        <span class="comment">// fit an ARMA(1,1) model</span>
</pre>
    </td>
  </tr>
  <tr id="L246">
    <th class="line-num">
      <a href="#L246">246</a>
    </th>
    <td class="line-code">
      <pre>        ConditionalSumOfSquares fit1 = <span class="keyword">new</span> ConditionalSumOfSquares(
</pre>
    </td>
  </tr>
  <tr id="L247">
    <th class="line-num">
      <a href="#L247">247</a>
    </th>
    <td class="line-code">
      <pre>            xt,
</pre>
    </td>
  </tr>
  <tr id="L248">
    <th class="line-num">
      <a href="#L248">248</a>
    </th>
    <td class="line-code">
      <pre>            <span class="integer">1</span>, <span class="integer">0</span>, <span class="integer">1</span>);
</pre>
    </td>
  </tr>
  <tr id="L249">
    <th class="line-num">
      <a href="#L249">249</a>
    </th>
    <td class="line-code">
      <pre>        ARMAModel arma = fit1.getARMAModel();
</pre>
    </td>
  </tr>
  <tr id="L250">
    <th class="line-num">
      <a href="#L250">250</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">the ARMA(1,1) model: %s%n</span><span class="delimiter">&quot;</span></span>, arma);
</pre>
    </td>
  </tr>
  <tr id="L251">
    <th class="line-num">
      <a href="#L251">251</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L252">
    <th class="line-num">
      <a href="#L252">252</a>
    </th>
    <td class="line-code">
      <pre>        <span class="comment">// residual time series        </span>
</pre>
    </td>
  </tr>
  <tr id="L253">
    <th class="line-num">
      <a href="#L253">253</a>
    </th>
    <td class="line-code">
      <pre>        ARMAForecastOneStep xt_hat = <span class="keyword">new</span> ARMAForecastOneStep(x, arma);
</pre>
    </td>
  </tr>
  <tr id="L254">
    <th class="line-num">
      <a href="#L254">254</a>
    </th>
    <td class="line-code">
      <pre>        <span class="type">double</span><span class="type">[]</span> residuals = <span class="keyword">new</span> <span class="type">double</span>[xt.length];
</pre>
    </td>
  </tr>
  <tr id="L255">
    <th class="line-num">
      <a href="#L255">255</a>
    </th>
    <td class="line-code">
      <pre>        <span class="keyword">for</span> (<span class="type">int</span> t = <span class="integer">0</span>; t &lt; xt.length; ++t) {
</pre>
    </td>
  </tr>
  <tr id="L256">
    <th class="line-num">
      <a href="#L256">256</a>
    </th>
    <td class="line-code">
      <pre>            residuals[t] = xt[t] - xt_hat.xHat(t);
</pre>
    </td>
  </tr>
  <tr id="L257">
    <th class="line-num">
      <a href="#L257">257</a>
    </th>
    <td class="line-code">
      <pre>        }
</pre>
    </td>
  </tr>
  <tr id="L258">
    <th class="line-num">
      <a href="#L258">258</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L259">
    <th class="line-num">
      <a href="#L259">259</a>
    </th>
    <td class="line-code">
      <pre>        <span class="comment">// fit a GARCH(1, 1) model</span>
</pre>
    </td>
  </tr>
  <tr id="L260">
    <th class="line-num">
      <a href="#L260">260</a>
    </th>
    <td class="line-code">
      <pre>        GARCHFit fit2 = <span class="keyword">new</span> GARCHFit(residuals, <span class="integer">1</span>, <span class="integer">1</span>);
</pre>
    </td>
  </tr>
  <tr id="L261">
    <th class="line-num">
      <a href="#L261">261</a>
    </th>
    <td class="line-code">
      <pre>        GARCHModel garch = fit2.getModel();
</pre>
    </td>
  </tr>
  <tr id="L262">
    <th class="line-num">
      <a href="#L262">262</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">the GARCH(1,1) model: %s%n</span><span class="delimiter">&quot;</span></span>, garch);
</pre>
    </td>
  </tr>
  <tr id="L263">
    <th class="line-num">
      <a href="#L263">263</a>
    </th>
    <td class="line-code">
      <pre>    }
</pre>
    </td>
  </tr>
  <tr id="L264">
    <th class="line-num">
      <a href="#L264">264</a>
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
