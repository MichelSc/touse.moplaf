rem "C:\Program Files (x86)\GnuWin32\bin\wget.exe" "http://localhost:8081/default_path/submit"  --post-file=file="C:\git\touse.jobsched\touse.moplaf.job\utils\win\job.xml"
rem "C:\Program Files (x86)\GnuWin32\bin\wget.exe" "http://localhost:8081/default_path/submit"  
rem "C:\Program Files (x86)\GnuWin32\bin\wget.exe"  --header="Content-type: multipart/form-data boundary=FILEUPLOAD" --post-file="job.xml" "http://localhost:8081/default_path/submit?scheme=michelscheme"
"C:\Program Files (x86)\GnuWin32\bin\wget.exe"  "http://localhost:8081/default_path/submit?filename=job.xml&scheme=michelscheme"
