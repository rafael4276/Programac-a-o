da = int(input("Insira o dia"))
mes = int(input("Insira o mes"))
an = int(input("Insira o ano"))
q = da % 7
if mes > 3:
    mlinha = mes - 2
elif mes < 3:
     mlinha = mes + 10
ma = abs((26*mlinha + 75) / 10)
m = ma % 7
s = an / 100
r = s % 4
if  r == 0:
    g = 0
elif  r != 0:
    g = 7 - 2 * r
b = an % 100
c = b / 4 + b
a = c % 7
dia = q + m + g + a
print(dia)
