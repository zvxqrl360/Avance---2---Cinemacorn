document.addEventListener('DOMContentLoaded', function () {
    const formulario = document.getElementById('formulario');
    const inputs = document.querySelectorAll('#formulario input');

    const expresiones = {
        nickname: /^[a-zA-Z0-9\_\-]{4,20}$/, // Letras, números, guion y guion_bajo
        nombres: /^[a-zA-ZÀ-ÿ\s]{1,40}$/, // Letras y espacios, pueden llevar acentos.
        apellido: /^[a-zA-ZÀ-ÿ\s]{1,40}$/, // Letras y espacios, pueden llevar acentos.
        dni: /^\d{8}$/, // 8 números.
        telefono: /^\d{9}$/, // 9 números.
        correo: /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,
        password: /^.{4,40}$/ // 4 a 40 dígitos.
    };

    const campos = {
        nickname: false,
        nombres: false,
        ape_paterno: false,
        ape_materno: false,
        dni: false,
        telefono: false,
        correo: false,
        password: false,
        password2: false
    };

    const validarFormulario = (e) => {
        switch (e.target.name) {
            case "nickname_usuario":
                validarCampo(expresiones.nickname, e.target, 'nickname');
                break;
            case "nombres_usuario":
                validarCampo(expresiones.nombres, e.target, 'nombres');
                break;
            case "ape_paterno_usuario":
                validarCampo(expresiones.apellido, e.target, 'ape_paterno');
                break;
            case "ape_materno_usuario":
                validarCampo(expresiones.apellido, e.target, 'ape_materno');
                break;
            case "dni_usuario":
                validarCampo(expresiones.dni, e.target, 'dni');
                break;
            case "telefono_usuario":
                validarCampo(expresiones.telefono, e.target, 'telefono');
                break;
            case "email_usuario":
                validarCampo(expresiones.correo, e.target, 'correo');
                break;
            case "contrasena_usuario":
                validarCampo(expresiones.password, e.target, 'password');
                validarPassword2();
                break;
            case "contrasena2_usuario":
                validarPassword2();
                break;
        }
    };

    const validarCampo = (expresion, input, campo) => {
        if (expresion.test(input.value)) {
            document.getElementById(`grupo_${campo}`).classList.remove('incorrecto');
            document.getElementById(`grupo_${campo}`).classList.add('correcto');
            campos[campo] = true;
        } else {
            document.getElementById(`grupo_${campo}`).classList.add('incorrecto');
            document.getElementById(`grupo_${campo}`).classList.remove('correcto');
            campos[campo] = false;
        }
    };

    const validarPassword2 = () => {
        const inputPassword1 = document.getElementById('password');
        const inputPassword2 = document.getElementById('password2');

        if (inputPassword1.value !== inputPassword2.value) {
            document.getElementById('grupo_password2').classList.add('incorrecto');
            document.getElementById('grupo_password2').classList.remove('correcto');
            campos['password2'] = false;
        } else {
            document.getElementById('grupo_password2').classList.remove('incorrecto');
            document.getElementById('grupo_password2').classList.add('correcto');
            campos['password2'] = true;
        }
    };

    inputs.forEach((input) => {
        input.addEventListener('keyup', validarFormulario);
        input.addEventListener('blur', validarFormulario);
    });

    formulario.addEventListener('submit', (e) => {
        e.preventDefault();
        const terminos = document.getElementById('terminos');

        if (campos.nickname && campos.nombres && campos.ape_paterno && campos.ape_materno && campos.dni && campos.telefono && campos.correo && campos.password && campos.password2 && terminos.checked) {
            document.getElementById('formulario_mensaje-exito').classList.add('formulario_mensaje-exito-activo');
            setTimeout(() => {
                document.getElementById('formulario_mensaje-exito').classList.remove('formulario_mensaje-exito-activo');
            }, 5000);

            formulario.reset();

            document.querySelectorAll('.correcto').forEach((icono) => {
                icono.classList.remove('correcto');
            });
        } else {
            document.getElementById('formulario_mensaje').classList.add('formulario_mensaje-activo');
        }
    });
});