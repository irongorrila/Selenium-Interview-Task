require 'rubygems'
require 'selenium-webdriver'

huburl = "http://127.0.0.1/wd/hub"

# Define desired_capabilities for a desktop web browser of your choice.

browser = #Instantiate webdriver over here.
test_case(browser)
browser.quit

def test_case(browser)
	# Maximize the browser window
	# Add 30 seconds implicit wait
	# Resolve http://flipkart.com/
	# Search for iPhone 6
	# Click on search
	# Click on mobile
	# Click on min
	# Click on 30000INR
	# Click on apple
	# Click on assured
	
	#Create a list to display price, product name and link to the product details page on console
end