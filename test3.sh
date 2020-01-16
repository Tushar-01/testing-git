#!/bin/bash
sleep 5
pid=$(ps -A | grep "vim" | awk '{print $1}') 
echo "Just Kidding!!!" & kill $pid
exit
