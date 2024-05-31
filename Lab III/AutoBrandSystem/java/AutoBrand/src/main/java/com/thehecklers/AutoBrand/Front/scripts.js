const baseUrl = 'http://localhost:8080/brands';

document.addEventListener('DOMContentLoaded', () => {
    fetchBrands();

    const brandForm = document.getElementById('brand-form');
    brandForm.addEventListener('submit', addBrand);

    const deleteForm = document.getElementById('delete-form');
    deleteForm.addEventListener('submit', deleteBrand);

    const editForm = document.getElementById('edit-form');
    editForm.addEventListener('submit', editBrand);
});

function fetchBrands() {
    fetch(baseUrl)
        .then(response => response.json())
        .then(data => {
            const brandList = document.getElementById('brand-list');
            brandList.innerHTML = data.map(brand => `
                <div>
                    <strong>${brand.abbreviation}</strong> - ${brand.name} (${brand.country})
                </div>
            `).join('');
        });
}

function addBrand(event) {
    event.preventDefault();

    const name = document.getElementById('name').value;
    const country = document.getElementById('country').value;
    const abbreviation = document.getElementById('abbreviation').value;

    fetch(baseUrl, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ name, country, abbreviation })
    })
        .then(response => response.json())
        .then(() => {
            fetchBrands();
            event.target.reset();
        });
}

function deleteBrand(event) {
    event.preventDefault();

    const abbreviation = document.getElementById('delete-abbreviation').value;

    fetch(`${baseUrl}/${abbreviation}`, {
        method: 'DELETE'
    })
        .then(() => {
            fetchBrands();
            event.target.reset();
        });
}

function editBrand(event) {
    event.preventDefault();

    const abbreviation = document.getElementById('edit-abbreviation').value;
    const name = document.getElementById('edit-name').value;
    const country = document.getElementById('edit-country').value;

    fetch(`${baseUrl}/${abbreviation}`, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ name, country, abbreviation })
    })
        .then(response => response.json())
        .then(() => {
            fetchBrands();
            event.target.reset();
        });
}
