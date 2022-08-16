print('----- Conversão -----')

type = {
  'foot': 0.3048,
  'meters': 3.2808399
}

def convert(value, type):
  return value * type

foot = float(input('Informe o valor em pé:'))

footResult = convert(foot, type['foot'])
print('Conversão de pé para mêtros: ' + str(footResult))

meters = float(input('Informe o valor em mêtros:'))

metersResult = convert(meters, type['meters'])
print('Conversão de mêtros para pé: ' + str(metersResult))
