fun main(args: Array<String>) {

    val shopping = Obra("Shopping")

    val cimento = Insumo("Cimento",18.99)
    val areia = Insumo("Areia",3.49)
    val cal = Insumo("Cal",10.49)

    val consumoAreia = InsumoUsado(areia, 5000)
    val consumoCimento = InsumoUsado(cimento, 600)
    val consumoCal = InsumoUsado(cal, 400)

    val pedreiro = MaoDeObra("Pedreiro", 300, 30.00)
    val engenheiro = MaoDeObra("Engenheiro", 150, 180.00)

    val trator = Equipamento("Trator", 500.00)
    val betoneira = Equipamento("Betoneira",50.00)

    val tratorUsado = EquipamentoUsado(trator, 40)
    val betoneiraUsado = EquipamentoUsado(betoneira, 40)

    shopping.insumosUsado.add(consumoAreia)
    shopping.insumosUsado.add(consumoCal)
    shopping.insumosUsado.add(consumoCimento)
    shopping.trabalhadores.add(pedreiro)
    shopping.trabalhadores.add(engenheiro)
    shopping.equipamentosTrabalhou.add(tratorUsado)
    shopping.equipamentosTrabalhou.add(betoneiraUsado)


    println("GASTOS DA OBRA - " + shopping.nome)
    println("Gastos com Insumos: R$" + shopping.gastoInsumos())
    println("Gastos com Mão de Obra: R$" + shopping.gastoMaoDeObra())
    println("Gastos com Equipamentos: R$" + shopping.gastoEquipamento())
    println("GASTO TOTAL: R$" + shopping.gastosObra())


}