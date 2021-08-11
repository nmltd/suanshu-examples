<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<title>/Examples/src/main/java/com/numericalmethod/suanshu/examples/LinearRegression.java - Public - Redmine</title>
<meta name="description" content="Redmine" />
<meta name="keywords" content="issue,bug,tracker" />
<meta name="csrf-param" content="authenticity_token" />
<meta name="csrf-token" content="/glxnU5yoXWIAXbSx6XUvW94JcYS+TkM85giRmJUmDe/v8K/o58p9yBS/7iX+p0kerW3nd0b0eR5GmagLtaWlA==" />
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

<form id="revision_selector" action="/projects/public/repository/entry/Examples/src/main/java/com/numericalmethod/suanshu/examples/LinearRegression.java" accept-charset="UTF-8" method="get"><input name="utf8" type="hidden" value="&#x2713;" />  <!-- Branches Dropdown -->


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
    / <a href="/projects/public/repository/changes/Examples/src/main/java/com/numericalmethod/suanshu/examples/LinearRegression.java">LinearRegression.java</a>


</h2>


<p>
<a href="/projects/public/repository/changes/Examples/src/main/java/com/numericalmethod/suanshu/examples/LinearRegression.java">History</a> |
    View |
    <a href="/projects/public/repository/annotate/Examples/src/main/java/com/numericalmethod/suanshu/examples/LinearRegression.java">Annotate</a> |
<a href="/projects/public/repository/raw/Examples/src/main/java/com/numericalmethod/suanshu/examples/LinearRegression.java">Download</a>
(11 KB)
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
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.algebra.linear.matrix.doubles.Matrix</span>;
</pre>
    </td>
  </tr>
  <tr id="L26">
    <th class="line-num">
      <a href="#L26">26</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.algebra.linear.matrix.doubles.matrixtype.dense.DenseMatrix</span>;
</pre>
    </td>
  </tr>
  <tr id="L27">
    <th class="line-num">
      <a href="#L27">27</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.algebra.linear.vector.doubles.Vector</span>;
</pre>
    </td>
  </tr>
  <tr id="L28">
    <th class="line-num">
      <a href="#L28">28</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.algebra.linear.vector.doubles.dense.DenseVector</span>;
</pre>
    </td>
  </tr>
  <tr id="L29">
    <th class="line-num">
      <a href="#L29">29</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.stats.regression.linear.LMProblem</span>;
</pre>
    </td>
  </tr>
  <tr id="L30">
    <th class="line-num">
      <a href="#L30">30</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.stats.regression.linear.glm.GLMProblem</span>;
</pre>
    </td>
  </tr>
  <tr id="L31">
    <th class="line-num">
      <a href="#L31">31</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.stats.regression.linear.glm.GeneralizedLinearModel</span>;
</pre>
    </td>
  </tr>
  <tr id="L32">
    <th class="line-num">
      <a href="#L32">32</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.stats.regression.linear.glm.distribution.GLMFamily</span>;
</pre>
    </td>
  </tr>
  <tr id="L33">
    <th class="line-num">
      <a href="#L33">33</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.stats.regression.linear.glm.distribution.GLMPoisson</span>;
</pre>
    </td>
  </tr>
  <tr id="L34">
    <th class="line-num">
      <a href="#L34">34</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.stats.regression.linear.glm.quasi.GeneralizedLinearModelQuasiFamily</span>;
</pre>
    </td>
  </tr>
  <tr id="L35">
    <th class="line-num">
      <a href="#L35">35</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.stats.regression.linear.glm.quasi.QuasiGLMProblem</span>;
</pre>
    </td>
  </tr>
  <tr id="L36">
    <th class="line-num">
      <a href="#L36">36</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.stats.regression.linear.glm.quasi.family.QuasiFamily</span>;
</pre>
    </td>
  </tr>
  <tr id="L37">
    <th class="line-num">
      <a href="#L37">37</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.stats.regression.linear.glm.quasi.family.QuasiGamma</span>;
</pre>
    </td>
  </tr>
  <tr id="L38">
    <th class="line-num">
      <a href="#L38">38</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.stats.regression.linear.logistic.LogisticRegression</span>;
</pre>
    </td>
  </tr>
  <tr id="L39">
    <th class="line-num">
      <a href="#L39">39</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.stats.regression.linear.ols</span>.*;
</pre>
    </td>
  </tr>
  <tr id="L40">
    <th class="line-num">
      <a href="#L40">40</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.stats.regression.linear.residualanalysis.LMDiagnostics</span>;
</pre>
    </td>
  </tr>
  <tr id="L41">
    <th class="line-num">
      <a href="#L41">41</a>
    </th>
    <td class="line-code">
      <pre><span class="keyword">import</span> <span class="include">com.numericalmethod.suanshu.stats.regression.linear.residualanalysis.LMInformationCriteria</span>;
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
      <pre><span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L44">
    <th class="line-num">
      <a href="#L44">44</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * Demonstrates how to do Ordinary Least Square regression in Java using SuanShu.</span>
</pre>
    </td>
  </tr>
  <tr id="L45">
    <th class="line-num">
      <a href="#L45">45</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> *</span>
</pre>
    </td>
  </tr>
  <tr id="L46">
    <th class="line-num">
      <a href="#L46">46</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> * @author Haksun Li</span>
</pre>
    </td>
  </tr>
  <tr id="L47">
    <th class="line-num">
      <a href="#L47">47</a>
    </th>
    <td class="line-code">
      <pre><span class="comment"> */</span>
</pre>
    </td>
  </tr>
  <tr id="L48">
    <th class="line-num">
      <a href="#L48">48</a>
    </th>
    <td class="line-code">
      <pre><span class="directive">public</span> <span class="directive">final</span> <span class="type">class</span> <span class="class">LinearRegression</span> {
</pre>
    </td>
  </tr>
  <tr id="L49">
    <th class="line-num">
      <a href="#L49">49</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L50">
    <th class="line-num">
      <a href="#L50">50</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">private</span> LinearRegression() {
</pre>
    </td>
  </tr>
  <tr id="L51">
    <th class="line-num">
      <a href="#L51">51</a>
    </th>
    <td class="line-code">
      <pre>    }
</pre>
    </td>
  </tr>
  <tr id="L52">
    <th class="line-num">
      <a href="#L52">52</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L53">
    <th class="line-num">
      <a href="#L53">53</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * The matrix of factor values used for OLS.</span>
</pre>
    </td>
  </tr>
  <tr id="L54">
    <th class="line-num">
      <a href="#L54">54</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L55">
    <th class="line-num">
      <a href="#L55">55</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="directive">final</span> Matrix TEST_X1 =
</pre>
    </td>
  </tr>
  <tr id="L56">
    <th class="line-num">
      <a href="#L56">56</a>
    </th>
    <td class="line-code">
      <pre>        <span class="keyword">new</span> DenseMatrix(<span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span><span class="type">[]</span>{
</pre>
    </td>
  </tr>
  <tr id="L57">
    <th class="line-num">
      <a href="#L57">57</a>
    </th>
    <td class="line-code">
      <pre>        {<span class="float">1.52</span>, <span class="float">2.23</span>, <span class="float">4.31</span>},
</pre>
    </td>
  </tr>
  <tr id="L58">
    <th class="line-num">
      <a href="#L58">58</a>
    </th>
    <td class="line-code">
      <pre>        {<span class="float">3.22</span>, <span class="float">6.34</span>, <span class="float">3.46</span>},
</pre>
    </td>
  </tr>
  <tr id="L59">
    <th class="line-num">
      <a href="#L59">59</a>
    </th>
    <td class="line-code">
      <pre>        {<span class="float">4.32</span>, <span class="float">12.2</span>, <span class="float">23.1</span>},
</pre>
    </td>
  </tr>
  <tr id="L60">
    <th class="line-num">
      <a href="#L60">60</a>
    </th>
    <td class="line-code">
      <pre>        {<span class="float">10.1034</span>, <span class="float">43.2</span>, <span class="float">22.3</span>},
</pre>
    </td>
  </tr>
  <tr id="L61">
    <th class="line-num">
      <a href="#L61">61</a>
    </th>
    <td class="line-code">
      <pre>        {<span class="float">12.1</span>, <span class="float">2.12</span>, <span class="float">3.27</span>}
</pre>
    </td>
  </tr>
  <tr id="L62">
    <th class="line-num">
      <a href="#L62">62</a>
    </th>
    <td class="line-code">
      <pre>    });
</pre>
    </td>
  </tr>
  <tr id="L63">
    <th class="line-num">
      <a href="#L63">63</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L64">
    <th class="line-num">
      <a href="#L64">64</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * The vector of dependent variables used for OLS.</span>
</pre>
    </td>
  </tr>
  <tr id="L65">
    <th class="line-num">
      <a href="#L65">65</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L66">
    <th class="line-num">
      <a href="#L66">66</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="directive">final</span> <span class="predefined-type">Vector</span> TEST_Y1 =
</pre>
    </td>
  </tr>
  <tr id="L67">
    <th class="line-num">
      <a href="#L67">67</a>
    </th>
    <td class="line-code">
      <pre>        <span class="keyword">new</span> DenseVector(<span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="float">2.32</span>, <span class="float">0.452</span>, <span class="float">4.53</span>, <span class="float">12.34</span>, <span class="float">32.2</span>});
</pre>
    </td>
  </tr>
  <tr id="L68">
    <th class="line-num">
      <a href="#L68">68</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L69">
    <th class="line-num">
      <a href="#L69">69</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * The vector of weights used for testing.</span>
</pre>
    </td>
  </tr>
  <tr id="L70">
    <th class="line-num">
      <a href="#L70">70</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L71">
    <th class="line-num">
      <a href="#L71">71</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="directive">final</span> <span class="predefined-type">Vector</span> TEST_W = <span class="keyword">new</span> DenseVector(<span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="float">0.2</span>, <span class="float">0.4</span>, <span class="float">0.1</span>, <span class="float">0.3</span>, <span class="float">0.1</span>});
</pre>
    </td>
  </tr>
  <tr id="L72">
    <th class="line-num">
      <a href="#L72">72</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L73">
    <th class="line-num">
      <a href="#L73">73</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * The matrix of factor values used for GLM.</span>
</pre>
    </td>
  </tr>
  <tr id="L74">
    <th class="line-num">
      <a href="#L74">74</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L75">
    <th class="line-num">
      <a href="#L75">75</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="directive">final</span> Matrix TEST_X2 =
</pre>
    </td>
  </tr>
  <tr id="L76">
    <th class="line-num">
      <a href="#L76">76</a>
    </th>
    <td class="line-code">
      <pre>        <span class="keyword">new</span> DenseMatrix(<span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span><span class="type">[]</span>{
</pre>
    </td>
  </tr>
  <tr id="L77">
    <th class="line-num">
      <a href="#L77">77</a>
    </th>
    <td class="line-code">
      <pre>        {<span class="float">1.52</span>, <span class="float">2.11</span>},
</pre>
    </td>
  </tr>
  <tr id="L78">
    <th class="line-num">
      <a href="#L78">78</a>
    </th>
    <td class="line-code">
      <pre>        {<span class="float">3.22</span>, <span class="float">4.32</span>},
</pre>
    </td>
  </tr>
  <tr id="L79">
    <th class="line-num">
      <a href="#L79">79</a>
    </th>
    <td class="line-code">
      <pre>        {<span class="float">4.32</span>, <span class="float">1.23</span>},
</pre>
    </td>
  </tr>
  <tr id="L80">
    <th class="line-num">
      <a href="#L80">80</a>
    </th>
    <td class="line-code">
      <pre>        {<span class="float">10.1034</span>, <span class="float">8.43</span>},
</pre>
    </td>
  </tr>
  <tr id="L81">
    <th class="line-num">
      <a href="#L81">81</a>
    </th>
    <td class="line-code">
      <pre>        {<span class="float">12.1</span>, <span class="float">7.31</span>}
</pre>
    </td>
  </tr>
  <tr id="L82">
    <th class="line-num">
      <a href="#L82">82</a>
    </th>
    <td class="line-code">
      <pre>    });
</pre>
    </td>
  </tr>
  <tr id="L83">
    <th class="line-num">
      <a href="#L83">83</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L84">
    <th class="line-num">
      <a href="#L84">84</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * The vector of dependent variables used for GLM.</span>
</pre>
    </td>
  </tr>
  <tr id="L85">
    <th class="line-num">
      <a href="#L85">85</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L86">
    <th class="line-num">
      <a href="#L86">86</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="directive">final</span> <span class="predefined-type">Vector</span> TEST_Y2 = <span class="keyword">new</span> DenseVector(<span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="integer">2</span>, <span class="integer">1</span>, <span class="integer">4</span>, <span class="integer">5</span>, <span class="integer">7</span>});
</pre>
    </td>
  </tr>
  <tr id="L87">
    <th class="line-num">
      <a href="#L87">87</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L88">
    <th class="line-num">
      <a href="#L88">88</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L89">
    <th class="line-num">
      <a href="#L89">89</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * Showcases different types of regressions implemented in SuanShu.</span>
</pre>
    </td>
  </tr>
  <tr id="L90">
    <th class="line-num">
      <a href="#L90">90</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     *</span>
</pre>
    </td>
  </tr>
  <tr id="L91">
    <th class="line-num">
      <a href="#L91">91</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param args not used</span>
</pre>
    </td>
  </tr>
  <tr id="L92">
    <th class="line-num">
      <a href="#L92">92</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @throws Exception if an error occurs during a regression</span>
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
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="type">void</span> main(<span class="predefined-type">String</span><span class="type">[]</span> args) <span class="directive">throws</span> <span class="exception">Exception</span> {
</pre>
    </td>
  </tr>
  <tr id="L95">
    <th class="line-num">
      <a href="#L95">95</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.println(<span class="string"><span class="delimiter">&quot;</span><span class="content">This class demonstrates how to do Ordinary Least Square regression in</span><span class="delimiter">&quot;</span></span>
</pre>
    </td>
  </tr>
  <tr id="L96">
    <th class="line-num">
      <a href="#L96">96</a>
    </th>
    <td class="line-code">
      <pre>            + <span class="string"><span class="delimiter">&quot;</span><span class="content"> Java using SuanShu.</span><span class="delimiter">&quot;</span></span>);
</pre>
    </td>
  </tr>
  <tr id="L97">
    <th class="line-num">
      <a href="#L97">97</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L98">
    <th class="line-num">
      <a href="#L98">98</a>
    </th>
    <td class="line-code">
      <pre>        olsEqualWeight(TEST_X1, TEST_Y1, <span class="predefined-constant">true</span>);
</pre>
    </td>
  </tr>
  <tr id="L99">
    <th class="line-num">
      <a href="#L99">99</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.println();
</pre>
    </td>
  </tr>
  <tr id="L100">
    <th class="line-num">
      <a href="#L100">100</a>
    </th>
    <td class="line-code">
      <pre>        olsWeighted(TEST_X1, TEST_Y1, TEST_W, <span class="predefined-constant">true</span>);
</pre>
    </td>
  </tr>
  <tr id="L101">
    <th class="line-num">
      <a href="#L101">101</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L102">
    <th class="line-num">
      <a href="#L102">102</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.println();
</pre>
    </td>
  </tr>
  <tr id="L103">
    <th class="line-num">
      <a href="#L103">103</a>
    </th>
    <td class="line-code">
      <pre>        glm(TEST_X2, TEST_Y2, <span class="predefined-constant">true</span>, <span class="keyword">new</span> GLMFamily(<span class="keyword">new</span> GLMPoisson()));
</pre>
    </td>
  </tr>
  <tr id="L104">
    <th class="line-num">
      <a href="#L104">104</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L105">
    <th class="line-num">
      <a href="#L105">105</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.println();
</pre>
    </td>
  </tr>
  <tr id="L106">
    <th class="line-num">
      <a href="#L106">106</a>
    </th>
    <td class="line-code">
      <pre>        quasiGLM(TEST_X2, TEST_Y2, <span class="predefined-constant">true</span>, <span class="keyword">new</span> QuasiFamily(
</pre>
    </td>
  </tr>
  <tr id="L107">
    <th class="line-num">
      <a href="#L107">107</a>
    </th>
    <td class="line-code">
      <pre>            <span class="keyword">new</span> com.numericalmethod.suanshu.stats.regression.linear.glm.quasi.family.QuasiPoisson()));
</pre>
    </td>
  </tr>
  <tr id="L108">
    <th class="line-num">
      <a href="#L108">108</a>
    </th>
    <td class="line-code">
      <pre>        quasiGLM(<span class="keyword">new</span> DenseMatrix(<span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span><span class="type">[]</span>{{<span class="float">1.52</span>}, {<span class="float">3.22</span>}, {<span class="float">4.32</span>}, {<span class="float">10.1034</span>}, {<span class="float">12.1</span>}}),
</pre>
    </td>
  </tr>
  <tr id="L109">
    <th class="line-num">
      <a href="#L109">109</a>
    </th>
    <td class="line-code">
      <pre>                 <span class="keyword">new</span> DenseVector(<span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="float">1.3</span>, <span class="float">2.4</span>, <span class="float">0.4</span>, <span class="integer">2</span>, <span class="float">5.2</span>}),
</pre>
    </td>
  </tr>
  <tr id="L110">
    <th class="line-num">
      <a href="#L110">110</a>
    </th>
    <td class="line-code">
      <pre>                 <span class="predefined-constant">true</span>,
</pre>
    </td>
  </tr>
  <tr id="L111">
    <th class="line-num">
      <a href="#L111">111</a>
    </th>
    <td class="line-code">
      <pre>                 <span class="keyword">new</span> QuasiFamily(<span class="keyword">new</span> QuasiGamma()));
</pre>
    </td>
  </tr>
  <tr id="L112">
    <th class="line-num">
      <a href="#L112">112</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L113">
    <th class="line-num">
      <a href="#L113">113</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.println();
</pre>
    </td>
  </tr>
  <tr id="L114">
    <th class="line-num">
      <a href="#L114">114</a>
    </th>
    <td class="line-code">
      <pre>        logistic(<span class="keyword">new</span> DenseMatrix(<span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span><span class="type">[]</span>{
</pre>
    </td>
  </tr>
  <tr id="L115">
    <th class="line-num">
      <a href="#L115">115</a>
    </th>
    <td class="line-code">
      <pre>            {<span class="float">1.52</span>},
</pre>
    </td>
  </tr>
  <tr id="L116">
    <th class="line-num">
      <a href="#L116">116</a>
    </th>
    <td class="line-code">
      <pre>            {<span class="float">3.22</span>},
</pre>
    </td>
  </tr>
  <tr id="L117">
    <th class="line-num">
      <a href="#L117">117</a>
    </th>
    <td class="line-code">
      <pre>            {<span class="float">4.32</span>},
</pre>
    </td>
  </tr>
  <tr id="L118">
    <th class="line-num">
      <a href="#L118">118</a>
    </th>
    <td class="line-code">
      <pre>            {<span class="float">10.1034</span>},
</pre>
    </td>
  </tr>
  <tr id="L119">
    <th class="line-num">
      <a href="#L119">119</a>
    </th>
    <td class="line-code">
      <pre>            {<span class="float">12.1</span>}
</pre>
    </td>
  </tr>
  <tr id="L120">
    <th class="line-num">
      <a href="#L120">120</a>
    </th>
    <td class="line-code">
      <pre>        }), <span class="keyword">new</span> DenseVector(<span class="keyword">new</span> <span class="type">double</span><span class="type">[]</span>{<span class="integer">0</span>, <span class="integer">1</span>, <span class="integer">0</span>, <span class="integer">1</span>, <span class="integer">1</span>}), <span class="predefined-constant">true</span>);
</pre>
    </td>
  </tr>
  <tr id="L121">
    <th class="line-num">
      <a href="#L121">121</a>
    </th>
    <td class="line-code">
      <pre>    }
</pre>
    </td>
  </tr>
  <tr id="L122">
    <th class="line-num">
      <a href="#L122">122</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L123">
    <th class="line-num">
      <a href="#L123">123</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L124">
    <th class="line-num">
      <a href="#L124">124</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * Runs an OLS regression on the given data, where all observations are given equal weight.</span>
</pre>
    </td>
  </tr>
  <tr id="L125">
    <th class="line-num">
      <a href="#L125">125</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     *</span>
</pre>
    </td>
  </tr>
  <tr id="L126">
    <th class="line-num">
      <a href="#L126">126</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param x         the factor values</span>
</pre>
    </td>
  </tr>
  <tr id="L127">
    <th class="line-num">
      <a href="#L127">127</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param y         the dependent variable values</span>
</pre>
    </td>
  </tr>
  <tr id="L128">
    <th class="line-num">
      <a href="#L128">128</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param intercept whether an intercept should be used as part of the regression.</span>
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
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="type">void</span> olsEqualWeight(Matrix x, <span class="predefined-type">Vector</span> y, <span class="type">boolean</span> intercept) {
</pre>
    </td>
  </tr>
  <tr id="L131">
    <th class="line-num">
      <a href="#L131">131</a>
    </th>
    <td class="line-code">
      <pre>        LMProblem problem = <span class="keyword">new</span> LMProblem(y, x, intercept);
</pre>
    </td>
  </tr>
  <tr id="L132">
    <th class="line-num">
      <a href="#L132">132</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L133">
    <th class="line-num">
      <a href="#L133">133</a>
    </th>
    <td class="line-code">
      <pre>        printOLSResults(problem);
</pre>
    </td>
  </tr>
  <tr id="L134">
    <th class="line-num">
      <a href="#L134">134</a>
    </th>
    <td class="line-code">
      <pre>    }
</pre>
    </td>
  </tr>
  <tr id="L135">
    <th class="line-num">
      <a href="#L135">135</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L136">
    <th class="line-num">
      <a href="#L136">136</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L137">
    <th class="line-num">
      <a href="#L137">137</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * Performs an OLS regression on the given problem and prints the results, as well as various</span>
</pre>
    </td>
  </tr>
  <tr id="L138">
    <th class="line-num">
      <a href="#L138">138</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * statistics.</span>
</pre>
    </td>
  </tr>
  <tr id="L139">
    <th class="line-num">
      <a href="#L139">139</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     *</span>
</pre>
    </td>
  </tr>
  <tr id="L140">
    <th class="line-num">
      <a href="#L140">140</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param problem the OLS problem on which to perform the regression</span>
</pre>
    </td>
  </tr>
  <tr id="L141">
    <th class="line-num">
      <a href="#L141">141</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L142">
    <th class="line-num">
      <a href="#L142">142</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="type">void</span> printOLSResults(LMProblem problem) {
</pre>
    </td>
  </tr>
  <tr id="L143">
    <th class="line-num">
      <a href="#L143">143</a>
    </th>
    <td class="line-code">
      <pre>        OLSRegression ols = <span class="keyword">new</span> OLSRegression(problem);
</pre>
    </td>
  </tr>
  <tr id="L144">
    <th class="line-num">
      <a href="#L144">144</a>
    </th>
    <td class="line-code">
      <pre>        OLSResiduals olsResiduals = ols.residuals();
</pre>
    </td>
  </tr>
  <tr id="L145">
    <th class="line-num">
      <a href="#L145">145</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L146">
    <th class="line-num">
      <a href="#L146">146</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">beta hat: %s,%nstderr: %s,%nt: %s,%nresiduals: %s%n</span><span class="delimiter">&quot;</span></span>,
</pre>
    </td>
  </tr>
  <tr id="L147">
    <th class="line-num">
      <a href="#L147">147</a>
    </th>
    <td class="line-code">
      <pre>                          ols.beta().betaHat(), ols.beta().stderr(), ols.beta().t(),
</pre>
    </td>
  </tr>
  <tr id="L148">
    <th class="line-num">
      <a href="#L148">148</a>
    </th>
    <td class="line-code">
      <pre>                          olsResiduals.residuals());
</pre>
    </td>
  </tr>
  <tr id="L149">
    <th class="line-num">
      <a href="#L149">149</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L150">
    <th class="line-num">
      <a href="#L150">150</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">R2: %f, AR2: %f, standard error: %f, f: %f%n</span><span class="delimiter">&quot;</span></span>,
</pre>
    </td>
  </tr>
  <tr id="L151">
    <th class="line-num">
      <a href="#L151">151</a>
    </th>
    <td class="line-code">
      <pre>                          olsResiduals.R2(), olsResiduals.AR2(), olsResiduals.stderr(),
</pre>
    </td>
  </tr>
  <tr id="L152">
    <th class="line-num">
      <a href="#L152">152</a>
    </th>
    <td class="line-code">
      <pre>                          olsResiduals.Fstat());
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
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">fitted values: %s%n</span><span class="delimiter">&quot;</span></span>, olsResiduals.fitted());
</pre>
    </td>
  </tr>
  <tr id="L155">
    <th class="line-num">
      <a href="#L155">155</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">leverage: %s%n</span><span class="delimiter">&quot;</span></span>, olsResiduals.leverage());
</pre>
    </td>
  </tr>
  <tr id="L156">
    <th class="line-num">
      <a href="#L156">156</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">standardized residuals: %s%n</span><span class="delimiter">&quot;</span></span>, olsResiduals.standardized());
</pre>
    </td>
  </tr>
  <tr id="L157">
    <th class="line-num">
      <a href="#L157">157</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">studentized residuals: %s%n</span><span class="delimiter">&quot;</span></span>, olsResiduals.studentized());
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
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">sum of squared residuals: %s%n</span><span class="delimiter">&quot;</span></span>, olsResiduals.RSS());
</pre>
    </td>
  </tr>
  <tr id="L160">
    <th class="line-num">
      <a href="#L160">160</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">total sum of squares: %f%n</span><span class="delimiter">&quot;</span></span>, olsResiduals.TSS());
</pre>
    </td>
  </tr>
  <tr id="L161">
    <th class="line-num">
      <a href="#L161">161</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L162">
    <th class="line-num">
      <a href="#L162">162</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.println();
</pre>
    </td>
  </tr>
  <tr id="L163">
    <th class="line-num">
      <a href="#L163">163</a>
    </th>
    <td class="line-code">
      <pre>        LMDiagnostics olsDiagnostics = ols.diagnostics();
</pre>
    </td>
  </tr>
  <tr id="L164">
    <th class="line-num">
      <a href="#L164">164</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L165">
    <th class="line-num">
      <a href="#L165">165</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">DFFITS (Welsch and Kuh measure): %s%n</span><span class="delimiter">&quot;</span></span>, olsDiagnostics.DFFITS());
</pre>
    </td>
  </tr>
  <tr id="L166">
    <th class="line-num">
      <a href="#L166">166</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">Hadi: %s%n</span><span class="delimiter">&quot;</span></span>, olsDiagnostics.Hadi());
</pre>
    </td>
  </tr>
  <tr id="L167">
    <th class="line-num">
      <a href="#L167">167</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">Cook distance: %s%n</span><span class="delimiter">&quot;</span></span>, olsDiagnostics.cookDistances());
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
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L170">
    <th class="line-num">
      <a href="#L170">170</a>
    </th>
    <td class="line-code">
      <pre>        LMInformationCriteria olsInformationCriteria = ols.informationCriteria();
</pre>
    </td>
  </tr>
  <tr id="L171">
    <th class="line-num">
      <a href="#L171">171</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L172">
    <th class="line-num">
      <a href="#L172">172</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">Akaike information criterion: %f%n</span><span class="delimiter">&quot;</span></span>, olsInformationCriteria.AIC());
</pre>
    </td>
  </tr>
  <tr id="L173">
    <th class="line-num">
      <a href="#L173">173</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">Bayesian information criterion: %f%n</span><span class="delimiter">&quot;</span></span>, olsInformationCriteria.BIC());
</pre>
    </td>
  </tr>
  <tr id="L174">
    <th class="line-num">
      <a href="#L174">174</a>
    </th>
    <td class="line-code">
      <pre>    }
</pre>
    </td>
  </tr>
  <tr id="L175">
    <th class="line-num">
      <a href="#L175">175</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L176">
    <th class="line-num">
      <a href="#L176">176</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L177">
    <th class="line-num">
      <a href="#L177">177</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * Runs an OLS regression on the given data, where observations are given the weight specified</span>
</pre>
    </td>
  </tr>
  <tr id="L178">
    <th class="line-num">
      <a href="#L178">178</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * in the given vector.</span>
</pre>
    </td>
  </tr>
  <tr id="L179">
    <th class="line-num">
      <a href="#L179">179</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     *</span>
</pre>
    </td>
  </tr>
  <tr id="L180">
    <th class="line-num">
      <a href="#L180">180</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param x         the factor values</span>
</pre>
    </td>
  </tr>
  <tr id="L181">
    <th class="line-num">
      <a href="#L181">181</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param y         the dependent variable values</span>
</pre>
    </td>
  </tr>
  <tr id="L182">
    <th class="line-num">
      <a href="#L182">182</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param w         the weight given to the observations</span>
</pre>
    </td>
  </tr>
  <tr id="L183">
    <th class="line-num">
      <a href="#L183">183</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param intercept whether an intercept should be used as part of the regression.</span>
</pre>
    </td>
  </tr>
  <tr id="L184">
    <th class="line-num">
      <a href="#L184">184</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L185">
    <th class="line-num">
      <a href="#L185">185</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="type">void</span> olsWeighted(Matrix x, <span class="predefined-type">Vector</span> y, <span class="predefined-type">Vector</span> w, <span class="type">boolean</span> intercept) {
</pre>
    </td>
  </tr>
  <tr id="L186">
    <th class="line-num">
      <a href="#L186">186</a>
    </th>
    <td class="line-code">
      <pre>        LMProblem problem = <span class="keyword">new</span> LMProblem(y, x, intercept, w);
</pre>
    </td>
  </tr>
  <tr id="L187">
    <th class="line-num">
      <a href="#L187">187</a>
    </th>
    <td class="line-code">
      <pre>        printOLSResults(problem);
</pre>
    </td>
  </tr>
  <tr id="L188">
    <th class="line-num">
      <a href="#L188">188</a>
    </th>
    <td class="line-code">
      <pre>    }
</pre>
    </td>
  </tr>
  <tr id="L189">
    <th class="line-num">
      <a href="#L189">189</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L190">
    <th class="line-num">
      <a href="#L190">190</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L191">
    <th class="line-num">
      <a href="#L191">191</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * Runs a GLM regression on the given data, with the given link function (family).</span>
</pre>
    </td>
  </tr>
  <tr id="L192">
    <th class="line-num">
      <a href="#L192">192</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     *</span>
</pre>
    </td>
  </tr>
  <tr id="L193">
    <th class="line-num">
      <a href="#L193">193</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param x         the factor values</span>
</pre>
    </td>
  </tr>
  <tr id="L194">
    <th class="line-num">
      <a href="#L194">194</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param y         the dependent variable values</span>
</pre>
    </td>
  </tr>
  <tr id="L195">
    <th class="line-num">
      <a href="#L195">195</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param intercept whether an intercept should be used as part of the regression</span>
</pre>
    </td>
  </tr>
  <tr id="L196">
    <th class="line-num">
      <a href="#L196">196</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param family    the link function</span>
</pre>
    </td>
  </tr>
  <tr id="L197">
    <th class="line-num">
      <a href="#L197">197</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L198">
    <th class="line-num">
      <a href="#L198">198</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="type">void</span> glm(Matrix x, <span class="predefined-type">Vector</span> y, <span class="type">boolean</span> intercept, GLMFamily family) {
</pre>
    </td>
  </tr>
  <tr id="L199">
    <th class="line-num">
      <a href="#L199">199</a>
    </th>
    <td class="line-code">
      <pre>        GLMProblem problem = <span class="keyword">new</span> GLMProblem(y, x, <span class="predefined-constant">true</span>, family);
</pre>
    </td>
  </tr>
  <tr id="L200">
    <th class="line-num">
      <a href="#L200">200</a>
    </th>
    <td class="line-code">
      <pre>        GeneralizedLinearModel glm = <span class="keyword">new</span> GeneralizedLinearModel(problem);
</pre>
    </td>
  </tr>
  <tr id="L201">
    <th class="line-num">
      <a href="#L201">201</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L202">
    <th class="line-num">
      <a href="#L202">202</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L203">
    <th class="line-num">
      <a href="#L203">203</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">beta hat: %s,%nstderr: %s,%nt: %s%n</span><span class="delimiter">&quot;</span></span>,
</pre>
    </td>
  </tr>
  <tr id="L204">
    <th class="line-num">
      <a href="#L204">204</a>
    </th>
    <td class="line-code">
      <pre>                          glm.beta().betaHat(), glm.beta().stderr(), glm.beta().t());
</pre>
    </td>
  </tr>
  <tr id="L205">
    <th class="line-num">
      <a href="#L205">205</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L206">
    <th class="line-num">
      <a href="#L206">206</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">fitted values: %s%n</span><span class="delimiter">&quot;</span></span>, glm.residuals().fitted());
</pre>
    </td>
  </tr>
  <tr id="L207">
    <th class="line-num">
      <a href="#L207">207</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">deviance residuals: %s%n</span><span class="delimiter">&quot;</span></span>, glm.residuals().devianceResiduals());
</pre>
    </td>
  </tr>
  <tr id="L208">
    <th class="line-num">
      <a href="#L208">208</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">deviance: %f, overdispersion: %f, AIC: %f%n</span><span class="delimiter">&quot;</span></span>,
</pre>
    </td>
  </tr>
  <tr id="L209">
    <th class="line-num">
      <a href="#L209">209</a>
    </th>
    <td class="line-code">
      <pre>                          glm.residuals().deviance(), glm.residuals().overdispersion(), glm.AIC());
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
      <pre><span class="comment">     * Runs a GLM regression on the given data, estimating beta with quasi-likelihood estimators</span>
</pre>
    </td>
  </tr>
  <tr id="L214">
    <th class="line-num">
      <a href="#L214">214</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * from the given family.</span>
</pre>
    </td>
  </tr>
  <tr id="L215">
    <th class="line-num">
      <a href="#L215">215</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     *</span>
</pre>
    </td>
  </tr>
  <tr id="L216">
    <th class="line-num">
      <a href="#L216">216</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param x         the factor values</span>
</pre>
    </td>
  </tr>
  <tr id="L217">
    <th class="line-num">
      <a href="#L217">217</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param y         the dependent variable values</span>
</pre>
    </td>
  </tr>
  <tr id="L218">
    <th class="line-num">
      <a href="#L218">218</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param intercept whether an intercept should be used as part of the regression</span>
</pre>
    </td>
  </tr>
  <tr id="L219">
    <th class="line-num">
      <a href="#L219">219</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param family    the family</span>
</pre>
    </td>
  </tr>
  <tr id="L220">
    <th class="line-num">
      <a href="#L220">220</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L221">
    <th class="line-num">
      <a href="#L221">221</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="type">void</span> quasiGLM(Matrix x, <span class="predefined-type">Vector</span> y, <span class="type">boolean</span> intercept, QuasiFamily family) {
</pre>
    </td>
  </tr>
  <tr id="L222">
    <th class="line-num">
      <a href="#L222">222</a>
    </th>
    <td class="line-code">
      <pre>        GeneralizedLinearModelQuasiFamily quasi = <span class="keyword">new</span> GeneralizedLinearModelQuasiFamily(
</pre>
    </td>
  </tr>
  <tr id="L223">
    <th class="line-num">
      <a href="#L223">223</a>
    </th>
    <td class="line-code">
      <pre>            <span class="keyword">new</span> QuasiGLMProblem(y, x, intercept, family));
</pre>
    </td>
  </tr>
  <tr id="L224">
    <th class="line-num">
      <a href="#L224">224</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">beta hat: %s,%nstderr: %s,%nt: %s%n</span><span class="delimiter">&quot;</span></span>,
</pre>
    </td>
  </tr>
  <tr id="L225">
    <th class="line-num">
      <a href="#L225">225</a>
    </th>
    <td class="line-code">
      <pre>                          quasi.beta().betaHat(), quasi.beta().stderr(), quasi.beta().t());
</pre>
    </td>
  </tr>
  <tr id="L226">
    <th class="line-num">
      <a href="#L226">226</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L227">
    <th class="line-num">
      <a href="#L227">227</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">fitted values: %s%n</span><span class="delimiter">&quot;</span></span>, quasi.residuals().fitted());
</pre>
    </td>
  </tr>
  <tr id="L228">
    <th class="line-num">
      <a href="#L228">228</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">deviance residuals: %s%n</span><span class="delimiter">&quot;</span></span>, quasi.residuals().devianceResiduals());
</pre>
    </td>
  </tr>
  <tr id="L229">
    <th class="line-num">
      <a href="#L229">229</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">deviance: %f, overdispersion: %f%n</span><span class="delimiter">&quot;</span></span>,
</pre>
    </td>
  </tr>
  <tr id="L230">
    <th class="line-num">
      <a href="#L230">230</a>
    </th>
    <td class="line-code">
      <pre>                          quasi.residuals().deviance(), quasi.residuals().overdispersion());
</pre>
    </td>
  </tr>
  <tr id="L231">
    <th class="line-num">
      <a href="#L231">231</a>
    </th>
    <td class="line-code">
      <pre>    }
</pre>
    </td>
  </tr>
  <tr id="L232">
    <th class="line-num">
      <a href="#L232">232</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L233">
    <th class="line-num">
      <a href="#L233">233</a>
    </th>
    <td class="line-code">
      <pre>    <span class="comment">/**</span>
</pre>
    </td>
  </tr>
  <tr id="L234">
    <th class="line-num">
      <a href="#L234">234</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * Runs a logistic regression on the given data.</span>
</pre>
    </td>
  </tr>
  <tr id="L235">
    <th class="line-num">
      <a href="#L235">235</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     *</span>
</pre>
    </td>
  </tr>
  <tr id="L236">
    <th class="line-num">
      <a href="#L236">236</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param x         the factor values</span>
</pre>
    </td>
  </tr>
  <tr id="L237">
    <th class="line-num">
      <a href="#L237">237</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param y         the dependent variable values</span>
</pre>
    </td>
  </tr>
  <tr id="L238">
    <th class="line-num">
      <a href="#L238">238</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @param intercept whether an intercept should be used as part of the regression</span>
</pre>
    </td>
  </tr>
  <tr id="L239">
    <th class="line-num">
      <a href="#L239">239</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     * @throws Exception thrown if an error occurs during the regression</span>
</pre>
    </td>
  </tr>
  <tr id="L240">
    <th class="line-num">
      <a href="#L240">240</a>
    </th>
    <td class="line-code">
      <pre><span class="comment">     */</span>
</pre>
    </td>
  </tr>
  <tr id="L241">
    <th class="line-num">
      <a href="#L241">241</a>
    </th>
    <td class="line-code">
      <pre>    <span class="directive">public</span> <span class="directive">static</span> <span class="type">void</span> logistic(DenseMatrix x, DenseVector y, <span class="type">boolean</span> intercept) <span class="directive">throws</span> <span class="exception">Exception</span> {
</pre>
    </td>
  </tr>
  <tr id="L242">
    <th class="line-num">
      <a href="#L242">242</a>
    </th>
    <td class="line-code">
      <pre>        com.numericalmethod.suanshu.stats.regression.linear.LMProblem problem =
</pre>
    </td>
  </tr>
  <tr id="L243">
    <th class="line-num">
      <a href="#L243">243</a>
    </th>
    <td class="line-code">
      <pre>            <span class="keyword">new</span> com.numericalmethod.suanshu.stats.regression.linear.LMProblem(y, x, <span class="predefined-constant">true</span>);
</pre>
    </td>
  </tr>
  <tr id="L244">
    <th class="line-num">
      <a href="#L244">244</a>
    </th>
    <td class="line-code">
      <pre>        LogisticRegression logistic = <span class="keyword">new</span> LogisticRegression(problem);
</pre>
    </td>
  </tr>
  <tr id="L245">
    <th class="line-num">
      <a href="#L245">245</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">beta hat: %s,%nstderr: %s,%nt: %s%n</span><span class="delimiter">&quot;</span></span>,
</pre>
    </td>
  </tr>
  <tr id="L246">
    <th class="line-num">
      <a href="#L246">246</a>
    </th>
    <td class="line-code">
      <pre>                          logistic.beta().betaHat(), logistic.beta().stderr(), logistic.beta().t());
</pre>
    </td>
  </tr>
  <tr id="L247">
    <th class="line-num">
      <a href="#L247">247</a>
    </th>
    <td class="line-code">
      <pre>
</pre>
    </td>
  </tr>
  <tr id="L248">
    <th class="line-num">
      <a href="#L248">248</a>
    </th>
    <td class="line-code">
      <pre>        <span class="predefined-type">System</span>.out.printf(<span class="string"><span class="delimiter">&quot;</span><span class="content">fitted values: %s%n</span><span class="delimiter">&quot;</span></span>, logistic.residuals().fitted());
</pre>
    </td>
  </tr>
  <tr id="L249">
    <th class="line-num">
      <a href="#L249">249</a>
    </th>
    <td class="line-code">
      <pre>    }
</pre>
    </td>
  </tr>
  <tr id="L250">
    <th class="line-num">
      <a href="#L250">250</a>
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
