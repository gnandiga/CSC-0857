set terminal x11
set size 1,1
set grid
set nokey
set border 15
set tics scale 0
set xlabel "gi|13507739|ref|NC_000912.1|"
set ylabel "gi|108885074|ref|NC_000908.2|"
set format "%.0f"
set xrange [1:816394]
set yrange [1:580076]
set linestyle 1  lt 1 lw 2 pt 6 ps 1
set linestyle 2  lt 3 lw 2 pt 6 ps 1
set linestyle 3  lt 2 lw 2 pt 6 ps 1
plot \
 "out.fplot" title "FWD" w lp ls 1, \
 "out.rplot" title "REV" w lp ls 2

print "-- INTERACTIVE MODE --"
print "consult gnuplot docs for command list"
print "mouse 1: coords to clipboard"
print "mouse 2: mark on plot"
print "mouse 3: zoom box"
print "'h' for help in plot window"
print "enter to exit"
pause -1
