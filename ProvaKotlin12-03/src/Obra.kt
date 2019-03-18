class Obra(var nome: String) {

    val insumosUsado = arrayListOf<InsumoUsado>()

    fun gastoInsumos(): Double {
        var total: Double = 0.0
        for (insumo in insumosUsado) {
            total += insumo.insumo.preco * insumo.quantidade
        }
        return total
    }

    val trabalhadores = arrayListOf<MaoDeObra>()
    fun gastoMaoDeObra() :Double {
        var total: Double = 0.0
        for (trabalhador in trabalhadores) {
            total += trabalhador.precoPorHora * trabalhador.horasTrabalhadas
        }
        return total
    }

    val equipamentosTrabalhou = arrayListOf<EquipamentoUsado>()
    fun gastoEquipamento() :Double {
        var total: Double = 0.0
        for (equipamento in equipamentosTrabalhou) {
            total += equipamento.equipamento.custo * equipamento.horas
        }
        return total
    }

    fun gastosObra() :Double{
        return gastoEquipamento() + gastoInsumos() + gastoMaoDeObra()
    }

}