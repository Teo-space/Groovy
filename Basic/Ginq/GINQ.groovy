import java.util.stream.Collectors

println 'Start';



def numbers = [0, 1, 2]

assert [0, 1, 2] == GQ {
    from n in numbers
    select n
}.toList()
;

assert '0#1#2' == GQ {
    from n in numbers
    select n
}.stream()
    .map(e -> String.valueOf(e))
    .collect(Collectors.joining('#'))
;

def v = GQ{
            from n in [1, 1, 3, 3, 6, 6, 6]
            groupby n
            select n, count(n)
}
for (x in v)
{
    println x;
}
