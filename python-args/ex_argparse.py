import argparse

# Initialize parser
msg = "Adding description"
parser = argparse.ArgumentParser(description = msg)
 
# Adding optional argument
parser.add_argument("-o", "--Output", help = "Show Output")
 
# Read arguments from command line
args = parser.parse_args()
 
if args.Output:
    print("Displaying Output as: % s" % args.Output)
