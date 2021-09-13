def call(Map config = [:]) { 
  def scriptcontents = libraryResource "hello.py"
  writeFile file: "/tmp/hello.py", text: scriptcontents
  sh "python3 /tmp/hello.py"
}
