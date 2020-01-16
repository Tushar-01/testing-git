
pid=$(ps -A|grep "nautilus" | awk '{ printf $1}')
pid2=$(ps -A|grep "sublime" | awk '{ printf $1}')
sleep 5
kill "$pid"
kill "$pid2"
./test4.sh
