# Servlets

This is a basic Servlets example which is deployed to Heroku.

1. The index page takes an input ( which is supposed to be the download link ). 
2. The download link is verified and supposed to download the file to the Heroku temp folder.
3. Once the download finishes, the download link to the file is given. 
4. The user can then download the file from Heroku server. Since the temp folder in Heroku refreshes in every instance, the 
   file will not be retained.
   
The main purpose of this example is to test a Servlet example in Heroku and also to download files where proxy is an issue.
