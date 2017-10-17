<html>
   <head><title>demo</title></head>
<body>
   Hola Roman!
  <a href="user?mylocale=en">English </a> | <a href="user?mylocale=de">German </a>
  <h3 name="user.title"></h3>
  <script>
      
      i18n.init(function(err, t) {
  // translate nav
  $(".nav").i18n();

  // programatical access
  var appName = t("app.name");
})
  </script>
</body>
</html> 