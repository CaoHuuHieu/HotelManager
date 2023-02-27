const closeBtn = document.querySelector('.close')
const openBtn = document.querySelector('.open')
const navbarElement = document.querySelector('.navbar__link')
const listCartBtn = document.querySelector('.navbar-list-btn')

openBtn.addEventListener('click', () => {
    navbarElement.classList.toggle('toggle')
})
function listCartBtnClick(){
	const listCartElm = document.querySelector('.list-container')
  	listCartElm.classList.toggle('active')
}
