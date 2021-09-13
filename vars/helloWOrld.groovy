def call(Map config = [:]) { 
  def scriptcontents = libraryResource "hello.py"
  writeFile file: "hello.py", text: scriptcontents
  sh "python3 hello.py"
}
