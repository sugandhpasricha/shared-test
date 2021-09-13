def call(Map config = [:]) { 
  def scriptcontents = libraryResource "hello.py"
  writeFile file: "/tmp/hello.py", text: "print("This file was created just now")"
  sh "python3 /tmp/hello.py"
}
