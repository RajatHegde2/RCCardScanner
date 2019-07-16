import cv2
import numpy as np
from matplotlib import pyplot as plt

img = cv2.imread('D:/649533.png',0)
img2 = img.copy()
template = cv2.imread('D:\\Sketch (3).png',0)
w, h = template.shape[::-1]

# All the 6 methods for comparison in a list
methods = ['cv2.TM_CCOEFF_NORMED', 'cv2.TM_CCORR',]

for meth in methods:
    img = img2.copy()
    method = eval(meth)

    # Apply template Matching
    res = cv2.matchTemplate(img,template,method)
    min_val, max_val, min_loc, max_loc = cv2.minMaxLoc(res)

    # If the method is TM_SQDIFF or TM_SQDIFF_NORMED, take minimum
    if method in [cv2.TM_SQDIFF, cv2.TM_SQDIFF_NORMED]:
        top_left = min_loc
    else:
        top_left = max_loc
    bottom_right = (top_left[0] + w, top_left[1] + h)

    cv2.rectangle(img,top_left, bottom_right, 255, 10)
    f=open("hey.txt","w+")
    f.write(str(top_left[0]))
    f.write(str(top_left[1]))
    f.write(str(bottom_right[0]))	
    f.write(str(bottom_right[1]))
