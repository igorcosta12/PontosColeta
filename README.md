# 🌱 Central de Coleta Seletiva e Descarte Consciente

Este projeto tem como objetivo promover o descarte consciente de resíduos, oferecendo aos cidadãos uma plataforma para localizar e cadastrar pontos de coleta seletiva em sua cidade. O sistema foi desenvolvido com foco em usabilidade, sustentabilidade e impacto social.

---

## 📌 Funcionalidades

- ✅ Cadastro de pontos de coleta seletiva com geolocalização automática
- 🗺️ Visualização dos pontos cadastrados em um mapa interativo
- 🔍 Filtro de pontos por tipo de resíduo (papel, plástico, eletrônico etc.)
- 📋 Listagem completa dos pontos cadastrados
- 📤 Envio automático de latitude e longitude com base no endereço
- 🔧 Backend em Java com Spring Boot e Frontend com HTML/CSS/JS puro

---

## 🚧 Funcionalidades Futuras (Manutenção Evolutiva)

- ✏️ CRUD completo para o usuário: editar e remover os próprios pontos
- 👨‍💼 Área administrativa: acesso total a todos os pontos cadastrados
- 🔐 Autenticação de usuários com login e senha
- 📱 Versão mobile aprimorada com Progressive Web App (PWA)

---

## 🛠️ Tecnologias Utilizadas

### 🔙 Back-End
- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Banco H2 (banco de dados em memória)
- Maven

### 🔝 Front-End
- HTML5
- CSS3
- JavaScript (vanilla)
- API Nominatim (OpenStreetMap) para geolocalização
- Leaflet.js para visualização no mapa

---

## 📸 Telas do Sistema

- `index.html` – Página inicial com menu de navegação
- `cadastro.html` – Cadastro de novos pontos com geolocalização automática
- `lista.html` – Exibição de todos os pontos cadastrados
- `filtro.html` – Filtro por tipo de resíduo
- `mapa.html` – Mapa com todos os pontos marcados

---

## 🧪 Como Executar o Projeto

### Pré-requisitos:

- Java JDK 17+
- Maven instalado
- IntelliJ, Eclipse ou outro editor compatível

### Passos:

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
````

2. Acesse o diretório do projeto:

```bash
cd seu-repositorio
```

3. Compile e rode o projeto com o Maven:

```bash
./mvnw spring-boot:run
```

4. Acesse o back-end:

```
http://localhost:8080
```

5. Abra manualmente os arquivos `.html` dentro de `src/main/resources/static/` para navegar pelas telas.


