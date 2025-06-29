# Brainwave_Matrix_Intern

For Cloud Computing Internship 

TASK 1:
Deploy a web application in AWS/Kubernetes/GCP/any other Platforms.

Host a static website using S3  

Amazon Simple Storage Service (Amazon S3) can be used to host static Websites without a need for a Web server cost efficiently. S3 buckets can be used to host the HTML, CSS and JavaScript files for entire static websites.

Step 1: To Create an S3 Bucket 

🔸Sign in to the AWS Management Console.
🔸Open the Amazon S3 console.
🔸Click on "Create Bucket" button.
🔸Provide a globally unique name for bucket and select Region.
🔸Finally click > Create

Step 2: Enable Static Website Hosting

🔹Select the bucket you just created.
🔹 Go to the "Properties" tab.
🔹 Scroll down to > Static website hosting and click > Edit. 
🔹 Enable & input your index document (e.g., index.html). 
🔹 Set an optional error document
🔹 Save the changes made

Step 3 : Upload Website Files

🔺  Click "Upload" in the S3 bucket.
🔺 Upload your website files (e.g > index.html, error.html, CSS, JS files, images, etc.)

Step 4: Configure Public Access

 🔹 Go to > Permissions tab.
 🔹 Scroll down to > Block Public Access and uncheck all options.
 🔹 Click > Save changes

Step 5: Add a Bucket Policy
🔸 Go to the "Permissions" tab.
🔸 Add a policy to make the bucket for allowing public access to content
🔸 Click > Save

Step 6: Access Your Website (Testing/Validation)

🔹 Copy > URL from the S3 bucket properties 
🔹 Paste the URL into your browser to test your static website

TASK 2:
E-commerce site or any static website with cloud storage
This project involves creating a simple HTML/CSS website and deploying it to Google Cloud.

1. Create Website Files
Make folder: mkdir my-website && cd my-website

Create index.html with basic HTML structure

Create styles.css for styling

2. Test Locally
Open index.html in a browser

3. Prepare for Deployment
Create app.yaml (for App Engine) with static file config

4. Deploy to Google Cloud (App Engine)
Install & set up Google Cloud SDK (gcloud init)

Run: gcloud config set project YOUR_PROJECT_ID

Deploy: gcloud app deploy

View site: gcloud app browse

Alternative: Deploy to Google Cloud Storage (Simpler)

🔹Create bucket
🔹Enable static hosting
🔹Set public access
🔹Upload files
🔹Access site 



