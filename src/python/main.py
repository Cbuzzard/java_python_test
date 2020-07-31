import praw
import yaml
import os
dirname = os.path.dirname(__file__)
filename = os.path.join(dirname, './config.yml')

with open(filename) as file:
    data = yaml.load(file, Loader=yaml.FullLoader)

redditUser = data['reddit']['username']
redditPass = data['reddit']['password']
redditId = data['submission']['id']
redditSecret = data['submission']['secret']

reddit = praw.Reddit(client_id= redditId, client_secret= redditSecret, user_agent='my user agent', username= redditUser, password= redditPass)
subreddit = reddit.subreddit('readitcheck')

file = open("test.txt", "w")

for submission in subreddit.top("all"):
    file.write(submission.title + "\n")