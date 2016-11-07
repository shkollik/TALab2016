<html>
<head>
  <style type="text/css">
    *{
  color: #333366;
  }
  body{
  background: rgba(250,250,210,0.5);
  font-size: 100%;  
  }


  #center{
  margin-top: 10%;
  }
   #footter { 
	margin-top: 30%;
	}
  </style>
</head>
<body>
<div id="header">
<div align="center"><h2>Welcome, stranger. Hope you enjoy! -)</h2>
<h4>Let's grant our best clients together!!!</h4>
<p></p>
</div>
</div>

<div id="center" >
<div align="right">STEP #1</div>
<div align="center">
<form action ="./BalanceController">
<input type="submit" value="Show table Balance firstly"> 
</form>
</div>

<div align="right">STEP #2</div>
<div align="center">
<p><b>So, now we gonna see clients where balance at least equals to the required value</b></p>
<p></p>
<form action ="./BalanceByAmountController">
<input type="text" name="amount" value="required minimum" onfocus="if (this.value == 'required minimum') {this.value = '';}" onblur="if (this.value == '') {this.value = 'required minimum';}">
<input type="submit" value="Show only required records"> 
</form>
</div>

<div align="right">STEP #3</div>
<div align="center">
<p></p>
<p><b>And finally - it's time to grant $$$</b></p>
<form action ="./BalanceBonusController">
<input type="text" name="amount" value="required minimum" onfocus="if (this.value == 'required minimum') {this.value = '';}" onblur="if (this.value == '') {this.value = 'required minimum';}">
<input type="text" name="bonus" value="granted bonus" onfocus="if (this.value == 'granted bonus') {this.value = '';}" onblur="if (this.value == '') {this.value = 'granted bonus';}">
<p></p>
<input type="submit" value = "Bonus for clients  where balance at least equals to the required value"> 
</form>
</div>
</div>

<div id="footter" align="center"><b>© Vladyslav Shkola 2016 TALAB</b></div>

</body>
</html>
