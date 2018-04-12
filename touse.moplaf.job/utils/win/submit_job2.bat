rem "C:\Program Files\curl-7.59.0-win64-mingw\bin\curl.exe" "http://localhost:8081/default_path/submit?scheme=michelscheme"
rem "C:\Program Files\curl-7.59.0-win64-mingw\bin\curl.exe" --data @job.xml  --verbose -X POST  http://localhost:8081/default_path/submit
"C:\Program Files\curl-7.59.0-win64-mingw\bin\curl.exe" --verbose http://localhost:8081/default_path/submit
