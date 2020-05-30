<p>
  Discover what fart you are! Simply enter the first letter of your name and the day of the month you were born! Ex: A 18
</p>

<input type="text" id="stdin"/>
<p id="credits"></p>
<form id="form">
  <button id="run">Run</button>
</form>
<code id="output"></code>

<script>
var run = document.getElementById("run");

run.addEventListener("click", function (e) {
  
  e.preventDefault();
  
  var stdin = document.getElementById("stdin");
  var form = document.getElementById("form");
  var credits = document.getElementById("credits");
  var output = document.getElementById("output");
  
  output.innerHTML = "Loading...";
  
  console.log(stdin.value);
  
  var obj = {};
  obj["clientId"] = "yourClientId";
  obj["clientSecret"] = "yourClientSecret";
  obj["script"] = "yourFormattedJavaCode";
  obj["language"] = "java";
  obj["versionIndex"] = "0";
  obj["stdin"] = stdin.value;
  var jsonStr = JSON.stringify(obj);
  
  console.log(jsonStr);
  
  const proxyurl = "https://cors-anywhere.herokuapp.com/";
  const url = "https://api.jdoodle.com/v1/execute";
  fetch(proxyurl + url, {
    method: 'post',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: jsonStr
  })
  .then(response => {
    return response.json()
  })
  .then(data => {
    console.log(data);
    var outputStr = data.output;
    console.log(outputStr);
    var formattedOutput = outputStr.replace(/(?:\r\n|\r|\n)/g, '<br>');
    output.innerHTML = formattedOutput;
  })
  .catch(() => console.log("Can’t access " + url + " response. Blocked by browser?"))
  
  const creditsUrl = "https://api.jdoodle.com/v1/credit-spent";
  fetch(proxyurl + creditsUrl, {
    method: 'post',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: jsonStr
  })
  .then(response => {
    return response.json()
  })
  .then(data => {
    console.log(data);
    var creditsLeft = 200 - data.used;
    console.log(credits);
    credits.innerHTML = "Runs left: " + creditsLeft;
  })
  .catch(() => console.log("Can’t access " + url + " response. Blocked by browser?"))
  
  
  
  
});
</script>
