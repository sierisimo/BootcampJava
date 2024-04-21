#!/bin/bash

coproc nc -l localhost 3000

while read -r cmd; do
	case $cmd in
	d) date ;;
	q) break ;;
	*) echo 'What?' ;;
	esac
done <&"${COPROC[0]}" >&"${COPROC[1]}"

kill "$COPROC_PID"
