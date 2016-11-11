# am1_group2016_2 Lesson 9

User Interface II

    - ListView and Adapters
    - Implementing navigation
    - Application
    
  Travel App 
  ```
        {
      "offset": 0,
      "data": [
        {
          "city": "Puno",
          "created": 1461022997000,
          "___class": "Place",
          "photo": "http://www.go2peru.com/destinos/large/pun_jul06_1315.jpg",
          "ownerId": null,
          "title": "Lago Titicaca y Puno",
          "updated": 1461023013000,
          "objectId": "B733A65C-FC35-CCDA-FF57-C34B1C5E7900",
          "desc": "Puno está localizado en las alturas de los Andes, a orillas del Titicaca, el lago navegable más alto del mundo habitado por los Uros y con maravillos paisajes. En las islas de Amantani y Taquile podrá tener la experiencia de compartir la vida con sus nativos y hacer turismo vivencial. Tierra del legendario pueblo Aymara y la Cultura Tiahuanaco. Puno es la capital folklórica del Perú. La fiesta de la Virgen de la Candelaria celebrada en febrero, es una extraordinaria oportunidad de vivir las tradiciones del pueblo puneño. Ofrece una excelente alternativa para el turismo arqueológico, de culturas vivas y biodiversidad.",
          "__meta": "{\"relationRemovalIds\":{},\"selectedProperties\":[\"city\",\"created\",\"___class\",\"photo\",\"ownerId\",\"title\",\"updated\",\"objectId\",\"desc\"],\"relatedObjects\":{}}"
        },
        {
          "city": "Iquitos",
          "created": 1461022922000,
          "___class": "Place",
          "photo": "http://www.go2peru.com/destinos/small/cruice1z.jpg",
          "ownerId": null,
          "title": "Iquitos y Río Amazonas",
          "updated": 1461022954000,
          "objectId": "68EB54A0-7453-259E-FF15-702D83CC6700",
          "desc": "La Selva Amazónica. Un lugar ideal para los amantes del turismo de naturaleza y la biodiversidad y para quienes desean sentir un íntimo contacto con la naturaleza virgen de los bosques amazónicos. Desde Iquitos podrá tomar un crucero en el río Amazonas o alojarse en los albergues y lodges ubicados en plena jungla para explorar la selva y los más audaces y aventureros pueden llegar hasta las áreas naturales protegidas, destacando Pacaya Samiria y Allpahuayo Mishana, con exuberante fauna y flora, ideal para observación de aves, también puede tomar contacto con los aborígenes de la amazonía o conocer los ritos del ayahuasca.",
          "__meta": "{\"relationRemovalIds\":{},\"selectedProperties\":[\"city\",\"created\",\"___class\",\"photo\",\"ownerId\",\"title\",\"updated\",\"objectId\",\"desc\"],\"relatedObjects\":{}}"
        },
        {
          "city": "Cuzco",
          "created": 1461022699000,
          "___class": "Place",
          "photo": "http://www.go2peru.com/destinos/small/cuz_mapi02x_jmz.jpg",
          "ownerId": null,
          "title": "Cuzco - Machu Picchu - Camino Inca",
          "updated": 1461022906000,
          "objectId": "58D6FCF1-117A-B740-FFBD-5AAC9479D400",
          "desc": "\"La Capital Arqueológica de América\"; constituye el mayor atractivo turístico del Perú y el más visitado. Cuzco fue la más grande ciudad y capital del Imperio Inca, luego fue tomada por los conquistadores españoles. Hoy en día muestra una arquitectura que fusiona el estilo Inca con el español. Su pueblo conserva con orgullo sus costumbres y tradiciones. Un lugar obligado para conocer es la mística y enigmática Machu Picchu la ciudad sagrada de los Incas que los conquistadores nunca conocieron y que fue descubirta a la cultura occidental en 1911, para llegar a ella también a través de la más famosa caminata el Camino Inca. Cuzco, como Machu Picchu, por su valor histórico y por su belleza han sido considerados como Patrimonio de la Humanidad. El Valle Sagrado de los Incas, Choquequirao, el Parque Nacional del Manu y muchos otros fascinantes lugares están esperando por usted.",
          "__meta": "{\"relationRemovalIds\":{},\"selectedProperties\":[\"city\",\"created\",\"___class\",\"photo\",\"ownerId\",\"title\",\"updated\",\"objectId\",\"desc\"],\"relatedObjects\":{}}"
        },
        {
          "city": "Chiclayo",
          "created": 1461022671000,
          "___class": "Place",
          "photo": "http://www.go2peru.com/destinos/small/cix_museotr_25az.jpg",
          "ownerId": null,
          "title": "Chiclayo",
          "updated": 1461022886000,
          "objectId": "75CA8BE6-7188-99F5-FFBE-3AF270527800",
          "desc": "La ciudad de la Amistad. Chiclayo posee la fortuna de ser la puerta de entrada para los más recientes y espectaculares descubrimientos arqueológicos como el Señor de Sipán en Huaca Rajada, el Señor de Sicán en Batán Grande - Santuario Histórico Bosque de Pómac, el Valle de las Pirámides de Túcume y el Museo Tumbas Reales de Sipán. Gracias a esto, Chiclayo se convierte en el segundo destino, después del Cuzco, por el interés arqueológico e histórico que genera. Chiclayo es la ciudad de los brujos, curanderos y el esoterismo. Además en el circuito de playas podrá apreciar los milenarios caballitos de totora en Pimentel o Eten la 2da ciudad eucarística del Mundo. Tres áreas naturales protegidas ideales para los amantes de la naturaleza y observadores de aves. Posee una de las mejores cocinas del norte del Perú.",
          "__meta": "{\"relationRemovalIds\":{},\"selectedProperties\":[\"city\",\"created\",\"___class\",\"photo\",\"ownerId\",\"title\",\"updated\",\"objectId\",\"desc\"],\"relatedObjects\":{}}"
        },
        {
          "city": "Arequipa",
          "created": 1461022505000,
          "___class": "Place",
          "photo": "http://www.go2peru.com/destinos/small/Aqp_may06_0477z.jpg",
          "ownerId": null,
          "title": "Arequipa y Valle del Colca",
          "updated": 1461022890000,
          "objectId": "E35ADC42-F67D-6943-FFE8-6109F6634A00",
          "desc": "La ciudad de Arequipa también es conocida como la \"Ciudad Blanca\". Su centro histórico ha sido reconocido como Patrimonio Cultural de la Humanidad por la arquitectura de sus hermosas construcciones coloniales en sillar blanco, destacando sus casonas, iglesias, templos y monasterios como Santa Catalina. Está rodeada de una bella campiña con pueblos con hermosos paisajes. Desde aquí podrá visitar el famoso Valle del Colca y el Cañón del Colca, áreas naturales protegidas como la Reserva Nacional de Salinas y Aguada Blanca y el Santuario Nacional Lagunas de Mejía. En sus montañas y picos nevados, sus pampas o sus ríos son excelentes escenarios para deportes de aventura. Es un destino ideal para conocer monumentos coloniales, culturas vivas y realizar turismo al aire libre disfrutando de aventura, naturaleza y biodiversidad. Arequipa goza de una de las mejores cocinas del Perú.",
          "__meta": "{\"relationRemovalIds\":{},\"selectedProperties\":[\"city\",\"created\",\"___class\",\"photo\",\"ownerId\",\"title\",\"updated\",\"objectId\",\"desc\"],\"relatedObjects\":{}}"
        }
      ],
      "nextPage": null,
      "totalObjects": 5
    }
  ```
