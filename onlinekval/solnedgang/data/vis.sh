#!/bin/bash
for i in "$@"
do
	./visualize < $i > /tmp/vis.pbm
	gm convert /tmp/vis.pbm $i.png
	open $i.png
done
